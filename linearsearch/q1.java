//q1 search in strings

package linearsearch;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {

        String values = "vishnu";
        char target = 'v';
        System.out.println(search(values, target));
        System.out.println(Arrays.toString(values.toCharArray()));
        System.out.println(searchrange(values, target));
     

        
    }
   static boolean search(String str,char target){

    if(str.length()==0){
        return false;
    }

    // for(int i=0;i<str.length();i++){
    //     if(target == str.charAt(i));
    //     return true;
    // }

    //enhanced loop
    for(char ch: str.toCharArray()){
        if(ch==target);
        return true;
    }

    return false;
     
   }

   //search between a range 
   static boolean searchrange(String letters, char val){

    int start = 2;
    int end =5;
    if(letters.length()==0){
        return false;
    }

    for(int i=start;i<=end;i++){
        if(val==letters.charAt(i));
        return true;
    }
    return false;
   }

}
