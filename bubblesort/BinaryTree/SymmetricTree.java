import java.util.*;
public class SymmetricTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        Solution s = new Solution();
        System.out.println(s.isSymmetric(root));
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
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        return ismirror (root.left, root.right);
    }
    public boolean ismirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return ismirror(left.left, right.right) && ismirror(left.right, right.left);
    } 
}
