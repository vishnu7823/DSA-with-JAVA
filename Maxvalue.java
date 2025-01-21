public class Maxvalue {
    public static void main(String[] args) {

        int[] arr = {3,6,2,12,34};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,3 ));
        
    }

    static int max(int[] arr){

        if(arr.length==0){
            return -1;
        }
        int maxvalue = arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue ){
                maxvalue = arr[i];
            }

         }
         return maxvalue;

    }


    static int maxrange(int[] arr,int start,int end){

        if(end>start){    //edge cases
            return -1;
        }

        if(arr==null){
            return -1;
        }
        int maxvalue = arr[start];
         for(int i=start;i<end;i++){
            if(arr[i]>maxvalue ){
                maxvalue = arr[i];
            }

         }
         return maxvalue;

    }
}
