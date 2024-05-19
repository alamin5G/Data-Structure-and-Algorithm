/**
 * StackJava
 */
public class StackJava<E> {
    Node<E> top;
    int size;
    
    private static class Node<E>{
        E data;
        Node<E> next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    StackJava(){
        this.top = null;
        size = 0;
    }

    //push 
    public void push(E data){
        Node<E> newNode = new Node<>(data);
        if (top==null) {
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    //pop
    public E pop(){
        if (top == null) {
            return (E) "Empty Stack";
        }

        Node<E> temp = top;
        if (top.next == null) {

            top = null;
            return temp.data;
        }else{
            top = temp.next;
            temp.next = null;
            return temp.data;
        }
    }

    //get size
    public int length(){
        return size;
    }

    //peak
    
    //main method
    public static void main(String[] args) {
        StackJava<Integer> stack = new StackJava<>();

    }
    
}