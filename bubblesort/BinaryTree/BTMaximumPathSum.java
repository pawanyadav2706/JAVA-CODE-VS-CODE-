import java.util.*;
public class BTMaximumPathSum {
    public static void main(String [] args){
        TreeNode root = new TreeNode(-10);
		
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		Solution sol = new Solution();
		System.out.println(sol.maxpath(root));
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxpath(TreeNode root){
        helper(root);
        return ans;
    }
    int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);

        left = Math.max(0, left);
        right = Math.max(0, right);


        int pathsum = left + right + root.val;
        ans = Math.max(ans, pathsum);

        return Math.max(left, right) + root.val;
    }
}
