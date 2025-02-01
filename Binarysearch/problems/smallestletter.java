public class smallestletter {
    public static void main(String[] args) {
        char[] array = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(array,target));
        
    }

    public static  char nextGreatestLetter(char[] letters, char target) {
        
        
        int start = 0;
        int end = letters.length-1;

        int mid = start+(end-start)/2;
     while(start<=end){
        if(target > letters[mid]){
            start = mid+1;
        }
        else if(target < letters[mid]){
            end = mid-1;
        }
     }
        
        return letters[start % letters.length];
    }
    
}
