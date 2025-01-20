//find the largest element in the array

public class program4 {

    public static void largestelement(int[] arr){
        int max = arr[0];

        if(arr.length==1){
            System.out.println(arr[0]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args){
        int[] arr = {0};
        largestelement(arr);



    }
    
}
