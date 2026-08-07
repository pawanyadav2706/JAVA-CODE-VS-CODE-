import java.util.*;
public class SameTree {
    public static void main(String [] args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(4);
        p.right = new TreeNode(5);
        // second tree
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(4);
        q.right = new TreeNode(5);
        Solution s = new Solution();
        System.out.println(s.isSameTree(p, q));
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
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q ==  null){
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
