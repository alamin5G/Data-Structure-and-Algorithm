public class DoublyLinkedList<E>
 {
    
    private Node<E> head;
    private Node<E> tail;
    private int lenght;


    private class Node<E>{
        E data;
        Node<E> next;
        Node<E> previous;

       public Node(E data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }

    }

    DoublyLinkedList(){
        head = null;
        tail = null;
        lenght = 0;
    }
    //insert last
    public void insert(E data){
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;

        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
       
        lenght++;
    }

    //delete first
    public void deleteFirst(){
        if (isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.previous = null;
        }
        lenght--;
    }

    //delete last
    public void deleteLast(){
       if (isEmpty()) {
            System.out.println("Empty List");
            return;
       }

       if (head.next == null) {
            head = null;
            tail = null;
       }else{
        tail = tail.previous;
        tail.next = null;
       }
       lenght--;
    }

    // print the data of each node
    public void display(){
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //print the node data from the last
    public void displayReverse(){
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node<E> temp = tail;
        while (temp != null) {
            System.out.print(temp.data +"->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    //is empty or not
    public boolean isEmpty(){
        return lenght == 0;
    }

    //get the linked list size
    public int getLength(){
        return lenght;
    }


    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(4);
        linkedList.insert(6);
        linkedList.display();
        System.out.println("Size is - " + linkedList.getLength());
        System.out.println("print last to first");
        linkedList.displayReverse();
        System.out.println("After delete first");
        linkedList.deleteFirst();
        linkedList.display();
        System.out.println("Size is - " + linkedList.getLength());
        linkedList.displayReverse();

    }
}
