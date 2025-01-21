import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(5);  //syntax
        // list.add(45);
        // list.add(35);
        // list.add(454);
        // list.add(445);

        // System.out.print(list.contains(445));

        // list.set(0,34 );
        // list.remove(2);
        // System.out.println(list);

        //input
        for(int i=0;i<5;i++){

             list.add(sc.nextInt());

        }

        for(int i=0;i<5;i++){
            System.out.print(list.get(i));  //pass index here ,list[index] wont work
        }

      



    }
}
