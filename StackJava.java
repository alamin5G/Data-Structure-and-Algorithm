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
    

    //get size
    public int length(){
        return size;
    }



    //main method
    public static void main(String[] args) {
        StackJava<Integer> stack = new StackJava<>();

    }
    
}