//https://leetcode.com/problems/concatenation-of-array/description/ 
//array concatination

package arrayproblems;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        
    }





    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];

        }
        return arr;

    }
    
}
