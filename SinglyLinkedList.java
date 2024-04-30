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

    public void toDisplay(){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int length(){
        ListNode current = head;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;
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
        
    }

}