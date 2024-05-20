/**
 * QueueJava
 */
public class QueueJava<E> {

    private Node<E> front;
    private Node<E> rear;
    private int length;

    private static class Node<E> {
        
        E data;
        Node<E> next;
        
        Node(E data){
            this.data = data;
            this.next = null;
        }
        
    }

    QueueJava(){
        this.front = null;
        this.rear = null;
        length = 0;
    }

    //enqueue 
    public void enqueue(E data){
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    //dequeue
    public E dequeue(){
        Node<E> temp = front;
        if (front == null) {
            return (E) "empty queue";
        }

        if (front.next == null) {
            front = null;
            rear = null;
            length--;
            return temp.data;
        }else{
            front = front.next;
            temp.next = null;
            length--;
            return temp.data;
        }
        
    }

    //is queue empty or not
    public boolean isEmpty(){
        return length == 0;
    }

    //get length
    public int getLength(){
        return length;
    }

    //print the data
    public void display(){
        if (front == null) {
            System.out.println("Empty Queue");
            return;
        }else{
            Node<E> temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

    
    }


    //main method;

    public static void main(String[] args) {
        QueueJava<Integer> queue = new QueueJava<>();
        queue.enqueue(5); //5 -> null
        queue.enqueue(15); //5 -> 15 ->null
        queue.enqueue(25); //5 -> 15 -> 25 ->null
        queue.enqueue(35); //5 -> 15 -> 25 -> 35 ->null
        queue.enqueue(45); //5 -> 15 -> 25 -> 35 -> 45 ->null

        queue.display();
        System.out.println("Size is = " + queue.getLength());
        System.out.println("After dequeue: " + queue.dequeue());
        
        queue.display();
        System.out.println("Size is = " + queue.getLength());
    }
    
}