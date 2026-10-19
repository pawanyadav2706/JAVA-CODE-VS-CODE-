import java.util.*;
public class IncreasingOrderSearchTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(1);
        root.right = new TreeNode(7);

        Solution sol = new Solution();

        TreeNode ans = sol.increasingBST(root);
        while(ans != null){
            System.out.println(ans.val + " ");
            ans = ans.right;
        }
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
    TreeNode dummy = new TreeNode(-1);
    TreeNode curr = dummy;
    public TreeNode increasingBST(TreeNode root){
        inorder(root);
        return dummy.right;
    }
    public void inorder(TreeNode root){
        // base case
        if(root == null){
            return ;
        }
        // inorder condition is the left root right 
        increasingBST(root.left);
        root.left = null;
        curr.right  = root;
        curr = root;
        increasingBST(root.right);
    }
}
