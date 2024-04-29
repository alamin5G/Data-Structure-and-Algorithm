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

}