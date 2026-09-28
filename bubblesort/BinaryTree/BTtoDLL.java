import java.util.*;
public class BTtoDLL{
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);
		
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		
		root.left.left.left = new TreeNode(1);

        Solution sol = new Solution();
        Node head = sol.bttoDLL(root);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " <-> ");
           temp =  temp.next ;
        }
        System.out.println("NULL");
        
    }
}
class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Solution {
    Node tail;
    Node head;
    public Node bttoDLL(TreeNode root){
        if(root == null){
            return null;
        }
        helper(root);
        return head;
    }
    private void helper(TreeNode root){
        if(root == null){
            return ;
        }
        // left
        helper(root.left);

        Node newnode = new Node(root.val);
        // root
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        helper(root.right);
    }
}