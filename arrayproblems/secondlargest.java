import java.util.*;

class secondlargest{

    public static void main(String[] args) {

        int[] array = {12,35,1,10,38,1};
        int solu  = secondlarge(array);
        System.out.println(solu);
        
    }

    static int secondlarge(int[] arr){

        // Arrays.sort(arr);
       int temp = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;
    }
}