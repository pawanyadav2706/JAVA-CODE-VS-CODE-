import java.util.*;
public class SubtreeofAnotherTree {
    public static void main(String [] args){
        // ROOT 1
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right =  new TreeNode(2);

        // ROOT 2
        TreeNode subRoot = new TreeNode(4);

        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        Solution sol = new Solution();
        System.out.println(sol.isSameTree(root, subRoot));
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null){
            return true;
        }
        if(isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isSameTree(TreeNode p, TreeNode q){
            if(p == null && q == null){
                return true;
            }
            if(p == null || q == null){
                return false;
            }
            if(p.val != q.val){
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

