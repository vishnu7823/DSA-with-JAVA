public class Binarysearch {

  public static void main(String[] args){

    int[] arrays = {-3,-2-1,2,3,5,7,9,10,12,45,67};
    int tarelement = -1;
    int solution = bsearch(arrays, tarelement);
    System.out.println(solution);

  }

  static int bsearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;

    while(start<=end){
        //find mid element
        // int mid = (start + end)/2;  might be exceeds the integer value
        int mid = start+(end-start)/2;

        if(target<arr[mid]){

            end = mid-1;

        }else if(target>arr[mid]){

            start = mid+1;
        }else{  //iftarget == mid element
            return mid;
        }
         

    }
    return -1;
  }
    
}
