//program to check the elements of array equal or not

import java.util.Arrays;

public class program2 {


    public static boolean areEqual(int[] arr1, int[] arr2){
        int n =arr1.length;
        int m = arr2.length;

        if(n!=m){
            return false;
        }

        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    
        public static void main(String[] args){
        int[] arr1 = {3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,7};

        if(areEqual(arr1, arr2)){
            System.out.println("two arrays are equal");
        }
        else{
            System.out.println("not equal");
        }

        

    }
}
