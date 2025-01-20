import java.util.*;

class array{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();

        }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]  + " ");
       }

       for(int num:arr){ //for every element in array ,print the element
        System.out.print("\n"+ num + " ");  //num indicated the elements of this array
       }

    //    System.out.println(arr[5]) ;//index out of bound error

       System.out.println(Arrays.toString(arr));


       String[] str = new String[4];
       for(int i=0;i<str.length;i++){
       str[i] = s.next();
       }
       System.out.println(Arrays.toString(str));

       str[2] = "vishnu";

       System.out.println(Arrays.toString(str));
    }
}