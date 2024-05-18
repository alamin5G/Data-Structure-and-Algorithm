/**
 * CircularLinkedList
 */
public class CircularLinkedList<E> {

    
    private Node<E> head;
    private Node<E> tail;
    private int length;

    private static class Node<E>{
        private E data;
        private Node<E> next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    CircularLinkedList(){
        this.head = null;
        this.tail = null;
        length = 0;
    }

    //insert last
    public void insert(E data){
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }else{
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        length++;
    }

     //insert first
     public void insertFirst(E data){
        Node<E> newNode = new Node<E>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = newNode;

        }
        length++;
     }

    //display the data;
    public void display(){
        Node<E> temp = tail.next;

        while (temp != tail) {
            System.out.print( temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->null");
    }

    //get size 
    public int getLength(){
        return length;
    }

    //main function

    public static void main(String[] args) {
        CircularLinkedList<Integer> linkedList = new CircularLinkedList<>();
        linkedList.insert(5);//5->null;
        linkedList.insert(7);//5->7->null;
        linkedList.insert(2);//5->7->2->null;
        linkedList.display();
        System.out.println("Total size = " + linkedList.getLength());
        
    }


}