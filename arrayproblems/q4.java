
//https://leetcode.com/problems/richest-customer-wealth/description/ 
// richest max wealth problem 2d array

package arrayproblems;

public class q4 {
    public static void main(String[] args) {

        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(maximumWealth(accounts));
        
    }


    public static  int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){

            int sum = 0;

            for(int baccount=0;baccount<accounts[person].length;baccount++){
                //add the 1st row elemts 
                sum = sum+accounts[person][baccount];

            }

            if(sum>max){
                max = sum;
            }

        }

        return max;


    }
}
