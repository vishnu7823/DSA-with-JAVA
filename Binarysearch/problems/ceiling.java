public class ceiling {

    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 15;
        int result = ceilingelement(array, target);
        System.out.println(result);
        
    }

    static int ceilingelement(int[] arr,int target) {  //smallest number that should be greater than or = target

        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;

        while(start<=end){

            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;

    }


}