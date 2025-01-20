//reverse a string

public class program3 {

    public static void reversestring(String str, char[] newstr){
        int n =str.length();
        for(int i=n-1;i>=0;i--){
            newstr[i] = str.charAt(i);
            System.out.print(newstr[i]);
        }
    }

    

    public static void main(String[] args){

        String str = "revanth";
        char[] newstr = new char[str.length()];

        reversestring(str, newstr);
      

    }
    
}
