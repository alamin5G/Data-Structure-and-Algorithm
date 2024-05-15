/**
 * SinglyLinkedList
 */
public class SinglyLinkedList<E> {

    private Node head;
    private Node tail;
    private int size;

    SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    private static class Node<E> {
    
        private E data;
        public Node next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    
    //insert linked list data from the first
    public void addFirst(E data){
        Node newNode = new Node<E>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
        }else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
   
     //insert linked list data into the last
    public void add(E data){
        Node newNode = new Node<E>(data);
        if (head==null) {
            head = newNode;
            tail = newNode;
            size++;
        }else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
     
    //to display linkedList data
    public void showData(){
        if (head == null) {
            System.out.println("Empty List");
        }else {
            Node temp = head;
            while (temp != null) {
                System.out.print( temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // to calculate the current length of the linkedlist
    public int getLength(){
        return size;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        
        //adding linkedList to the first 
        linkedList.addFirst(1); //1->null
        linkedList.addFirst(12);
        linkedList.addFirst(4);
        linkedList.addFirst(15);//15->4->12->1->null
        linkedList.showData();
        System.out.println("Size of the linked list is " + linkedList.getLength());;
        System.out.println("After adding at last...");
        linkedList.add(13);//15->4->12->1->13->1null
        linkedList.add(4);//15->4->12->1->13->4->1null
        linkedList.showData();
        System.out.println("Size of the linked list is " + linkedList.getLength());;
        

    }

}