import java.util.Arrays;
import java.util.*;

public class multidimensionarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        // int[][] arr = new int[5][];

        // int[][] arr1 = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };
        // System.out.println(Arrays.toString(arr1[2]));

        //input

        int[][] arr = new int[3][3];
        System.out.println(arr.length);  //output will be no of rows 

        for(int row=0;row<arr.length;row++){
            //for each colum in every row 

            for(int col =0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }


        }

        //output

        for(int row=0;row<arr.length;row++){
            //for each colum in every row 

            for(int col =0;col<arr[row].length;col++){
               
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();


        }

        
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
         
        //enhanced for loop
        for(int[] a:arr){
            System.out.print(Arrays.toString(a));
        }
    }
}
