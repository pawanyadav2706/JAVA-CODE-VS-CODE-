
import java.util.*;
public class Binarytree {
    public static void main(String [] args){
        BST sol =  new BST();
        sol.display();
    }
}
class BST {
    public class Node{
        private int val ;
        Node left;
        Node rigth;
        int heigth;
    }
    public Node(int val){
        this.val = val;
    } 
    public void BST(){
        Scanner sc = new Scanner(System.in);
    }
    private node root;
    private void Node(int val, Node node){
        if(node == null){
            return null;
        }
        
    }
    public void insert(Node node , root node ){
        if(root == null){
            return;
        }
        node  = Node.left(insert.node);
        insert(node, left);
    }
     node = Node.right(insert.node);
     insert(node, right);
    public void display(){
        System.out.println("Enter the root node: ");
        int val = new sc.nextInt();
        System.out.println(node.val);
        display(node.left , "enter the left node " + " : ");
        display(node.rigt, "enter the right node" + " : ");
    }
}
