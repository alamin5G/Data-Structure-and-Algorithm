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
    public E peak(){
        if (top==null) {
            return (E) "empty stack";
        }else{ 
        return top.data;
        }
    }


    //main method
    public static void main(String[] args) {
        StackJava<Integer> stack = new StackJava<>();
        System.out.println("before push");
        System.out.println("top = " + stack.top);
        System.out.println("length = " + stack.length());
        System.out.println("peak = " + stack.peak());
        System.out.println("after push");
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(-1);
        System.out.println("top = " + stack.top);
        System.out.println("length = " + stack.length());
        System.out.println("peak = " + stack.peak());
        System.out.println("1st pop : " + stack.pop());
        System.out.println("2nd pop : " + stack.pop());
        System.out.println("3nd pop : " + stack.pop());


    }
    
}