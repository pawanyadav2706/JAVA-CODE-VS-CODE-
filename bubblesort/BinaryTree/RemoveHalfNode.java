import java.util.*;
public class RemoveHalfNode {
    public static  void main(String [] args){
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.right.left = new Node(4);

        Solution sol = new Solution();
        root  = sol.removeHalfNodes(root);
        inorder(root);
    }
    static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
    }
}
class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}class Solution {
    public Node removeHalfNodes(Node root){
        if(root == null){
            return null;
        }
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);

        if(root.left == null && root.right != null){
            return root.right;
        }
        if(root.left != null && root.right == null){
            return root.left;

        }
        return root;
        

    }
}
