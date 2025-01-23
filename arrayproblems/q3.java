//https://leetcode.com/problems/running-sum-of-1d-array/description/


package arrayproblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
        
    }

    public static int[] runningSum(int[] num) {

        int[] arr = new int[num.length];
        arr[0] = num[0];
        for(int i=1;i<num.length;i++){
            arr[i] = num[i -1] + num[i];  //it stores the prev index value of nums array and add the curretn value of nums array adn return it 
        }

        return arr;

        
    }

}
