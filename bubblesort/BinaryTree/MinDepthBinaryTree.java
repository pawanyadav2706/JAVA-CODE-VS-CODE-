import java.util.*;
public class MinDepthBinaryTree {
    public static void main(String [] args){
        // TreeNode root = new TreeNode(3);

        // root.left = new TreeNode(9);
        // root.right = new TreeNode(20);

        // root.right.left = new TreeNode(15);
        // root.right.right = new TreeNode(7);

        // Solution sol = new Solution();

        // System.out.println(sol.mindepthvalue(root));

        TreeNode root = new TreeNode(2);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        Solution sol = new Solution();
        System.out.println(sol.mindepthvalue(root));
        

        
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
    public int mindepthvalue(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return mindepthvalue(root.right) + 1;
        }
        if(root.right == null){
            return mindepthvalue(root.left) + 1;
        }
        int left = mindepthvalue(root.left);
        int right = mindepthvalue(root.right);

        int mindepth = Math.min(left, right) + 1;
        return mindepth;
    }
}

