public class linked {

    // declare a node

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // declare the head and tail

    public Node head = null;
    public Node tail = null;

    // add new nodes

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;

            tail = newNode;
        }
    }

    // display

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        System.out.println("nodes of linkedlist");

        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        linked sList = new linked();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        sList.display();

    }
}
