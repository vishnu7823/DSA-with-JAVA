//list implementati0n using array -generic
import java.util.*;


class DynamicArray<T>{
   private int arr[];
    private int size;
    private int total_size;
    static final int initial_size =16;

    DynamicArray(){
        size = 0;
        arr = new int[initial_size];
        total_size = initial_size;
    }
    public void add(int val){
   
        if(size==total_size)
        expandArray();
        arr[size++]=val;

    }

    private void  expandArray(){
        total_size*=2;
        arr = java.util.Arrays.copyOf(arr, initial_size);
        

    }

    public void display(){
        System.out.println("The array elements:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
    }
    
    public void insertAtpos(int pos,int val){
        if(size==total_size)
         expandArray();
            for(int i=size-1;i>=pos;i--){
                arr[i+1] = arr[i]; 
            }
            arr[pos] =val;
            size++;
        }

        public void deleteAtpos(int pos){
            for(int i=pos+1;i<size-1;i++ )
              arr[i-1] = arr[i];
              size--;

              if(total_size>initial_size && total_size>3*size)
              shrinkArray();


            
        }

        private void shrinkArray(){
            total_size /=2;
            arr = java.util.Arrays.copyOf(arr, total_size);
        }



}

public class DynamicArrayDemo{
    public static void main (String[] args){
        DynamicArray<Integer> list = new DynamicArray();
        int val;
        int pos;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("-------------List Menu-------");
            System.out.println("1.Insert at the end");
            System.out.println("2.Display the list");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete from specified psition");
            System.out.println("5.Exit");
            System.out.println("--------------------");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the data:");
                        val = sc.nextInt();
                       list.add(val);
                       
                       break;
                case 2: list.display();
                         break;
                case 3: System.out.println("Enter the postion starts at 0");
                        pos = sc.nextInt();
                        if(pos<0){
                            System.out.println("Invalid Position");
                            break;
                        }
                        System.out.println("Enter the data");
                        val = sc.nextInt();
                        list.insertAtpos(pos,val);
                        break;
                case 4: System.out.println("Enter the pos starts from 0:");
                        pos= sc.nextInt();
                        if(pos<0){
                            System.out.println("Invalid position");
                            break;
                        }
                        list.deleteAtpos(pos);
                        break;
                case 5: System.exit(0);

                default: System.out.println("Invalid Choice");
            }

        }

    }
}