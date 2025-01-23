//q5 max wealth problem - richest max wealth leetcode problem


package linearsearch;

public class q5 {

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
         //when enter into new col make sum of the column
         int sum = 0;
        for(int baccount=0;baccount<accounts[person].length;baccount++){
            sum+=accounts[person][baccount];

        }

        //when the 1st row iterates it will check the max value by adding the nums

        if(sum>max){
            max = sum;
        }

     }
     return max;

    
}
}
