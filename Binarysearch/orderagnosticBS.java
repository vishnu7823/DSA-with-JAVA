public class orderagnosticBS {
    public static void main(String[] args) {

        int[] array = {-18,-12,-4,0,2,3,4,15,16,18,24,32,45,67,99,100};
        int tarelement = 99;
        int solution = bsearch(array,tarelement);
        System.out.println(solution);
    }

    static int bsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        //find if array is sorted in asc or desc;
        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
        int mid = start+(end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(isAsc){

            if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }else{

            if(target > arr[mid]){
                end = mid-11;
            }
            else {
                start = mid+1;
            }

        }

        

        }
        return -1;

        


    }
}
