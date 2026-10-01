import java.util.*;
public class LongestUnivaluePath {
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);

        root.right.right = new TreeNode(5);
        root.left.right.left = new TreeNode(1);

        root.left.right.right = new TreeNode(1);

        Solution sol = new Solution();
        int result = sol.longestunivaluepath(root);
        System.out.println(result);
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
    int ans = 0;
    public int longestunivaluepath(TreeNode root){
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        int leftpath = 0;
        int rightpath = 0;
        if(root.left != null && root.left.val == root.val){
            leftpath = left + 1;
        }
        if(root.right != null && root.right.val == root.val){
            rightpath = right + 1;
        }
        ans = Math.max(ans , leftpath +  rightpath);
        return Math.max(leftpath, rightpath);
    }
}
