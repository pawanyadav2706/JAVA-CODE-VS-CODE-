import java.util.*;
public class Pathsum {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Solution sol = new Solution();
        System.out.println(sol.pathsum(root, 3));
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
    public boolean pathsum(TreeNode root, int targetsum){
        if(root == null){
            return false;
        }
        if(root.val == targetsum && root.left == null && root.right ==null){
            return true;
        }
        return pathsum(root.left, targetsum - root.val) || pathsum(root.right, targetsum - root.val);
    }
}
