import java.util.*;
public class ValidateBinarySearchTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);
        
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        System.out.println(sol.isvalidbinarysearch(root));
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val){
        this.val = val;
    }
}
class Solution {
    public boolean isvalidbinarysearch(TreeNode root){
        return helper(root, null, null);
    }
    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }
        if(high != null && node.val >= high){
            return false;
        }
        boolean leftTree = helper(node, low, node.val);
        boolean rightTree = helper(node, node.val, high);

        return leftTree && rightTree;
    }
}
