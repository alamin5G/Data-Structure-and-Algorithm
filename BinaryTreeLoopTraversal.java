import java.util.Stack;

public class BinaryTreeLoopTraversal {

    private Node root;

    private static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        fourth.left = eighth;
        fourth.right = nine;
        fifth.left = ten;
    }

    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){

            Node current = stack.pop();

            System.out.print(current.data + " ");

            if(current.right != null){
                stack.push(current.right);
            }

            if(current.left != null){
                stack.push(current.left);
            }


        }
    }

    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
    }

    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                current = stack.pop();
                System.out.print(current.data + " ");

                current = current.right;

            }
        }
    }


    public static void main(String[] args) {
        BinaryTreeLoopTraversal tree = new BinaryTreeLoopTraversal();
        tree.createBinaryTree();
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);

    }
}
