/**
 * SinglyLinkedList
 */
public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    private static class Node<E> {
    
        private E data;
        public Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    
    //insert linked list data from the first
    public void addFirst(E data){
        Node<E> newNode = new Node<E>(data);
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
        Node<E> newNode = new Node<E>(data);
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

    //delete from the first
    public void removeFirst(){
        if (head == null) {
            System.out.println("Empty list");
        }else if(head.next == null){
            head = null;
            tail = null;
            size--;
        }else{
            head = head.next;
            size--;
        }
    }

    //delete from the last
    public void removeLast(){
        if (head == null) {
            System.out.println("Empty list");
        }else if(head.next == null){
            tail = null;
            head = null;
            size--;
        }else {
            Node<E> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }
     
    //to display linkedList data
    public void showData(){
        if (head == null) {
            System.out.println("Empty List");
        }else {
            Node<E> temp = head;
            while (temp != null) {
                System.out.print( temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    //insert data at given position
    public void insertAt(int position, E data){
        
        if (head==null) {
            System.out.println("empty list");
            return;
        }

        Node<E> newNode = new Node<E>(data);

        if (position == 0 ) {
            newNode.next = head;
            head = newNode;
            size++;
        }else if(position == size){
            tail.next = newNode;
            tail = newNode;
            size++;
        }else{
            Node<E> temp = head;
            int count = 0;
            while (count < position-1) {
                count++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    //delete from given position
    public void deleteAt(int position){
        if (head==null) {
            System.out.println("Empty List");
            return;
        }
        
        if (position == 0 && head.next == null) {
            head = null;
            tail = null;
        }else if(position == 0){
            head = head.next;
        }else{
            Node<E> temp = head;
            int count = 0;
            while (count < position-1) {
                count++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;

        }
        size--;
    }

    //find is the element is exist or not
    public boolean find(E keyValue){
        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.data == keyValue) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //get the value from given position
    public E getDataAt(int position){
        if (head==null || size>=position) {
            E st = (E) "no data";
            return st;
        }else{
            Node<E> temp = head;
            int count = 0;
            while (count < position) {
                temp = temp.next;
                count++;
            }
            return temp.data;
        }
    }

    // to calculate the current length of the linkedlist
    public int getLength(){
        return size;
    }

    //reverse the singly linked list
    public void reverse(){
        if (head == null) {
            System.out.println("Empty List");
        }else if(head.next == null){
            head.next = null;
        }else{
            
        }
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
        linkedList.add(7);//15->4->12->1->13->4->1null
        linkedList.showData();
        System.out.println("Size of the linked list is " + linkedList.getLength());;
        System.out.println("After removing the first element from the list");
        linkedList.removeFirst();
        linkedList.showData();
        System.out.println("Size of the linked list is " + linkedList.getLength());;
        System.out.println("After removing the last element from the list");
        linkedList.removeLast();
        linkedList.showData();
        System.out.println("Size of the linked list is " + linkedList.getLength());;
        System.out.println("After adding at 0 position");
        linkedList.insertAt(0, 10);
        linkedList.showData();
        System.out.println("Size = " + linkedList.getLength());
        System.out.println("After adding at last position");
        linkedList.insertAt(linkedList.getLength(), 20);
        linkedList.showData();
        System.out.println("Size = " + linkedList.getLength());
        System.out.println("After adding at somewhere(3)");
        linkedList.insertAt(3, 11);
        linkedList.showData();
        System.out.println("Size = " + linkedList.getLength());
        System.out.println("After deleteing at somewhere(0)");
        linkedList.deleteAt(0);
        linkedList.showData();
        System.out.println("Size = " + linkedList.getLength());
        System.out.println("After deleteing at somewhere(5)");
        linkedList.deleteAt(5);
        linkedList.showData();
        System.out.println("Size = " + linkedList.getLength());
        System.out.println("find a node data (12) : " + linkedList.find(12) );
        System.out.println("find a node data (1) : " + linkedList.find(1) );
        System.out.println("find a node data at given position(5) : " + linkedList.getDataAt(5));
    }

}