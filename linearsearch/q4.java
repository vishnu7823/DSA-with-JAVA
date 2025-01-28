package linearsearch;
public class q4{
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findevendigits(nums));
        
    }



       static int findevendigits(int[] nums){
        int count=0;
        for(int num: nums){

            if(even(num)){
                count++;
            }

           

        }
        return count;
    }
    static boolean even(int digit){
        int numofdigits = digit(digit);
        if(numofdigits%2==0){
            return true;
        }
        return false;
    }


    static int digit(int num){
        int count =0;
        while(num>0){
            count++;
            num=num/10;


        }
        return count;
    }

    
}