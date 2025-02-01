import java.util.*;
public class floor {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 15;
        int result = floorelement(array, target);
        System.out.println(result);
        
    }

    static int floorelement(int[] arr,int target) {  //greatest number that should be samller than or = target


        if(target>arr[arr.length-1] ){
            return -1;
        }
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
        return end;

    }


}
