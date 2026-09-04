import java.util.*;
public class DFSUsingstack {
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        BinaryTree tree = new BinaryTree();
        System.out.println("DFS Traversal of the binary tree:");
        tree.DFS(root);
    }
}
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(){
        root = null;
    }
    void DFS(Node node){
        if(node == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            System.out.print(current.val + " ");
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
    }
}
