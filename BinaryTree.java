public class BinaryTree<E> {
    private Node<E> root;
    private int size;

    private static class Node<E> {
        Node<E> left;
        Node<E> right;
        E data;

        Node(E data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    BinaryTree(){
        this.root = null;
    }


}
