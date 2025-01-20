import java.util.*;

class arrayTest{
    public static void insert(char[] array,int pos,char val){
        for(int i=array.length-1;i>=pos;i--){
            array[i] = array[i-1];

        }
        array[pos-1] = val;

        

    }

    public static void delete(char[] array,int pos){
        for(int i=array.length-1;i>=pos;i--){
            array[i] = array[i+1];
        }
        array[array.length-1] = '0';

    }
}


public class Arrayinsert {
    public static void main(String[] args){
        char array[] = new char[6];
        array[0] = 'A';
        array[1] = 'B';
        array[3] = 'C';
        array[4] = 'D';
        array[5] = 'E';
        for(int i =0;i<array.length;i++)
        System.out.println(array[i]);


        arrayTest.insert(array, 2, 'I');

        System.out.println(" ");
        for(int i =0;i<array.length;i++)
        System.out.println(array[i]);

        arrayTest.delete(array, 2);
        for(int j=0;j<array.length;j++)
        System.out.println(array[j]);




    }
    
}
