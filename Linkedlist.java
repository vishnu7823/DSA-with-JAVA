import java.util.*;


class List{
class Node{
    int data;
    Node next;

}

Linkedlist(){
     head =null;
}

  public void insertAtBegining(int val){
    Node newNode = new Node(val);

    if(head==null) //if list is empty
    head = newNode;

    else{//if not empty
        newNode.next=head;
        head = newNode;
           
    }
    
  }

  public void traverse(){
    Node temp =head;   // declare temp variabel for head
    while(temp!=null){
        System.out.print(temp.data + " "); // if head is not null print the data
        temp = temp.next; //move the head to the next node using the .next temp variabel and method
    }

    public void insertAtPos(int pos, int val){
        if(pos==0)
        insertAtBegining(val);
        Node newNode - new Node(val);
        Node temp = head;

    }for(int i=1;i<=pos-1;i++){
        temp = temp.next;

    }
    newNode.next = temp.next;
    temp.next = newNode;
    if(temp==null){
        System.out.println("invalid position");
        return;
    }



  }

}


public class Linkedlist {

    


  public static void main(String[] args){
    List.
  }


    
   
}


