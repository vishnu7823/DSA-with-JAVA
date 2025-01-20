//to find the duplicates in the list 

public class program5 {

    public static void findduplicate(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(  arr[i]+" ");
                    break;
                }
            }
           
            
        }
        
       
    }

    

    public static void main(String[] args){
        int[] arr = {1,2,3,2,5,3,6,8,9,8,7,5,6,9};
        findduplicate(arr);

    }
}
