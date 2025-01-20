import java.util.*;

public class program6 {

    // static void find(int str){
    // int n =str.length();
    // for(int i=0;i<n;i++){

    // }
    // }
   
    public static void main(String[] args) {
      
              String input = "banana";
            LinkedHashMap <Character,Integer> mp = new LinkedHashMap<>();
        
            for(int i=0;i<input.length();i++){
                char x = input.charAt(i);
                if(mp.get(x)==null){
                    mp.put(x,1);
                }
                else{
                    mp.put(x,mp.get(x)+1);
                }
            
            }

            

    }

}
