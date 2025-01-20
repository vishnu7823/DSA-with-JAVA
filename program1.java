//to find re occurence of the characters in the strings

class program1 {


    public static void removeChar(String str, char c){
        int n = str.length();
        String finalstr = " ";

        for(int i =0;i<n;i++){
            if(str.charAt(i)!=c){
                finalstr = finalstr+str.charAt(i);
            }
        }
        System.out.println(finalstr);
    
}

public static void main(String[] args){
    String str = "revanth rajkumar";
    char c = 'r';
    removeChar(str, c);

}
}
