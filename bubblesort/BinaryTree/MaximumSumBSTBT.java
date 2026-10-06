import java.util.*;
public class MaximumSumBSTBT {
    public static void main(String [] args){
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        Solution sol = new Solution();
        System.out.println(sol.maxSumBST(root));

    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val){
        this.val = val;
    }
}
class Solution {
    int ans = 0;
    public int maxSumBST(TreeNode root){
        dfs(root);
        return ans;
    }
    // min(0), max(1), sum
    public int[] dfs(TreeNode root){
        // base case
        if(root == null){
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE,0};
        }
        int leftsubtree[] = dfs(root.left);
        int rightsubtree[] = dfs(root.right);

        // check if current so add the node 
        if(root.val > leftsubtree[1] && root.val < rightsubtree[0]){
            int currsum = leftsubtree[2] + rightsubtree[2] + root.val;
            ans = Math.max(ans, currsum);

            int minval = Math.min(root.val, leftsubtree[0]);
            int maxval = Math.max(root.val, rightsubtree[1]);

            return new int[]{minval, maxval, currsum};
        }
        int maxsum  = Math.max(leftsubtree[2], rightsubtree[2]);
        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, maxsum};
    }
}
