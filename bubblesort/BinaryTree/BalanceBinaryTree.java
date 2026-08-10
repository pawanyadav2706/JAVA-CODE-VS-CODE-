import java.util.*;
public class BalanceBinaryTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution s = new Solution();
        System.out.println(s.isBalanced(root));
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
     public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        if(Math.abs(leftheight-  rightheight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
     }
     public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
     }
}
