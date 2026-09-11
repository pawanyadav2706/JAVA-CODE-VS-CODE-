import java.util.*;
public class Counttheavgsumandreturn {
    public static void main(String [] args){
        TreeNode root =new TreeNode(4);

        root.left = new TreeNode(8);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        System.out.println(sol.avgofsubtree(root));
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
    public int avgofsubtree(TreeNode root){
       solve(root);
       return ans;
    }
    int [] solve(TreeNode root){
        if(root == null){
            return new int [] {0,0};
        }
        int [] left = solve(root.left);
        int [] right = solve(root.right);

        int sum = left[0] + right[0] + root.val;
        int count  = left[1] + right[1] + 1;

        int avg  = sum / count;

        if(avg == root.val){
            ans++;
        }
        return new int [] {sum, count};
    }
}
