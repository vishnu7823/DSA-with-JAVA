package linearsearch;
import java.util.*;
public class search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //size of the array
        int[] nums = new int[n];   //declaration and initilization 
          for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
          }
          System.out.println(Arrays.toString(nums));
          int target = sc.nextInt();
    
        int solution = lsearch(nums, target);
        System.out.println(solution);

    }

    static int lsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return arr[i];
                // return i;
                
            }
        }

        return -1;

    }
}
