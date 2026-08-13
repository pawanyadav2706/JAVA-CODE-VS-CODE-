import java.util.*;
public class PopulatingRightPointersNode {
    public static void main(String [] args){
        Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		Solution sol = new Solution();
		
		Node result = sol.connect(root);
		printNextPointers(result);
	}
	public static void printNextPointers(Node root) {
        Node level = root;
        while (level != null) {
            Node current = level;
            while (current != null) {
                System.out.print(current.val + " -> ");
                if (current.next != null) {
                    System.out.print(current.next.val + "    ");
                } else {
                    System.out.print("null    ");
                }
                current = current.next;
            }
            System.out.println();
            // Move to next level
            level = level.left;
        }
    }
}

class Node {
    int val;
    Node left;
    Node right;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Solution {
    public Node connect(Node root){
        if(root == null){
            return null;
        }
        Node leftmost = root;
        while(leftmost.left != null){
            Node current = leftmost;
            while(current != null){
                current.left.next = current.right;

                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    } 
}
