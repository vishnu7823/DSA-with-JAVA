//q2 mimimum number

package linearsearch;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

            }
            System.out.println(Arrays.toString(arr));
            

            System.out.println(minnumsearch(arr));
            
            System.out.println(maxnumsearch(arr));


        
    }
//min value
    static int minnumsearch(int[] numbers){
        int min = numbers[0];
        if(numbers.length==0){
            return -1;
        }

        for(int i=0;i<numbers.length;i++){
           
            if(numbers[i]<min){
                min=numbers[i];

            }
           
           
             
        }
        return min;

    }

//max value
    static int maxnumsearch(int[] integers){
        int max = integers[0];
        if(integers.length==0){
            return -1;
        }

        for(int i=0;i<integers.length;i++){
            if(integers[i]>max){
                max = integers[i];
            }
        }
        return max;
    }
}
