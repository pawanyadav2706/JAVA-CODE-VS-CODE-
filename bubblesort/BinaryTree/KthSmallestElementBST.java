import java.util.*;
public class KthSmallestElementBST {
    public static void main(String [] args){
        TreeNode root =new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.left.right = new TreeNode(2);

        Solution sol = new Solution();
        System.out.println(sol.kthSmallest(root, 1));
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
    int count = 0;
    public int kthSmallest(TreeNode root, int k){
        return helper(root, k).val;
    }
    public TreeNode helper(TreeNode root, int k){
        if(root == null){
            return null;
        }
        TreeNode left = helper(root.left, k);
        if(left != null){
            return left;
        }
        count++;
        if(count == k){
            return root;
        }
        return helper(root.right, k);
    }
}
