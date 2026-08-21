import java.util.*;
public class LowestCommonAncestorBinaryTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Solution sol = new Solution();

        //  // p = node 5
        // TreeNode p = root.left;
        //  // q = node 1
        // TreeNode q = root.right;

        // p = node 5
        TreeNode p = root.left;
        // q = node 4
        TreeNode q = root.left.right.right;
        TreeNode result = sol.lowestcommonancestorBT(root, p, q);
        System.out.println(result.val);
        
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
    public TreeNode lowestcommonancestorBT(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode left = lowestcommonancestorBT(root.left, p, q);
        TreeNode right = lowestcommonancestorBT(root.right, p, q);

        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }else{
            return right;
        }
    }
}
