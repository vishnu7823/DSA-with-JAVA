import java.util.*;


public class maxproduct {
    public static void main(String[] args) {
        int[] array = {10,26,12,34};
        System.out.println(maxproducttriplet(array));
        
    }

    static int maxproducttriplet(int[] arr){
        int n   =arr.length;
      

        Arrays.sort(arr);

       
             int product = arr[n-1]*arr[n-2]*arr[n-3];
        

        return product;
    }
}
