public class LinkList<T> {
    
    Node head;

    class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    //add data at first
    public void addAtFirst(T data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
            return;
        }
    }


    //add data at last
    public void addAtLast(T data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }else{
            Node oldNode = head;
            while (oldNode.next != null) {
                oldNode = oldNode.next;
            }
            oldNode.next = newNode;
        }
    }

    public void showData(){
        if (head == null) {
            System.out.println("Empty List");
        }else{
            Node existNode = head;
            while (existNode != null) {
                System.out.print("" + existNode.data + "->");
                existNode = existNode.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.addAtFirst(2); //->2->null
        linkList.addAtFirst(5); //->5->2->null
        linkList.addAtFirst(9); //9->5->2->null
        linkList.addAtFirst(4); //4->9->5->2->null
        linkList.showData();
        System.out.println("After adding last in existing linkedList ");
        linkList.addAtLast(7); //4->9->5->2->7->null
        linkList.addAtLast(3); //4->9->5->2->7->3->null
        linkList.showData();
    }


}
