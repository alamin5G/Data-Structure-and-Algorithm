/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode<T> {
    
        private T data;
        public ListNode next;

        public ListNode(T data){
            this.data = data;
            this.next = null;
        }
        

    }

    //to display linkedList data
    public void toDisplay(){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    // to calculate the current length of the linkedlist
    public int length(){
        ListNode current = head;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    //insert linked list data from the first
    public void insertFirst(int value){
        ListNode newNode = new ListNode<Integer>(value);
        newNode.next = head;
        head = newNode;
    }

     //insert linked list data into the last
     public void inserLast(int value){
        ListNode newNode = new ListNode<Integer>(value);
       
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = new ListNode<Integer>(10);
        ListNode secListNode = new ListNode<Integer>(1);
        ListNode thirdListNode = new ListNode<Integer>(8);
        ListNode fourthListNode = new ListNode<Integer>(11);

        // now we will connect them togethher to form a chain
        linkedList.head.next = secListNode; //10 --> 1;
        secListNode.next = thirdListNode; // 10 --> 1 --> 8;
        thirdListNode.next = fourthListNode; // 10 --> 1 --> 8 --> 11;

        //print the linkedList values
        linkedList.toDisplay();
        //print the lenght of note 
        System.out.println("The length of the LinkedList is : " + linkedList.length());
        
        //adding linkedList to the first 
        linkedList.insertFirst(1);
        linkedList.insertFirst(12);
        linkedList.insertFirst(4);
        linkedList.insertFirst(15);

        linkedList.toDisplay();

        //insert last 
        linkedList.inserLast(0);
        linkedList.inserLast(1);
        linkedList.inserLast(10);
        
        linkedList.toDisplay();

    }

}