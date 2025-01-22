//2d array searching 

package linearsearch;
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] maxarr = {
            {24,45,56},
            {32,43,12},
            {78,20,23}
        };
      
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int[][] arr =  new int[row][colum];
 

        //user input
        for(int r=0;r<arr.length;r++){

            for(int c=0;c<arr[r].length;c++){
                arr[r][c] = sc.nextInt();

            }
        }

        //useroutput
       for(int r=0;r<arr.length;r++){
        System.out.println(Arrays.toString(arr[r]));
       }
        int target = sc.nextInt();
       
    
    System.out.println(search(arr, target));
    System.out.println(maxsearch(maxarr));
    }


    static int search(int[][] numbers,int t){
        if(numbers.length==0){
            return -1;
        }

        for(int r=0;r<numbers.length;r++){

            for(int c=0;c<numbers[r].length;c++){

                if(t == numbers[r][c]){
                    return  numbers[r][c];
                }
                

            }
    }
    return -1;
}


static int maxsearch(int[][] array ){

    int max = Integer.MIN_VALUE; //array[0][0] instead
        if(array.length==0){
            return -1;
        }

        //enhanced for loop

        for(int[] ints: array){
            for(int c=0;c<ints.length;c++){
                if(ints[c]>max){
                    max = ints[c];
                   
                }
            }
        }

        // for(int r=0;r<array.length;r++){

        //     for(int c=0;c<array[r].length;c++){
        //             if(array[r][c]>max){
        //                 max = array[r][c];
                       
        //             }
                

        //     }
        // }
        return max;
}
}
