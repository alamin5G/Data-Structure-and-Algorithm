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

    }

}