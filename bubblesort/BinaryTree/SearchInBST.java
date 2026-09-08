import java.util.*;
public class SearchInBST {
    public static void main(String [] args){
        TreeNode root  = new TreeNode(4);
        
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution sol = new Solution();

        TreeNode result = sol.searchBST(root, 2);
        if(result != null){
            System.out.println(result.val);
        }else{
            System.out.println("Not found");
        }
        System.out.println("subtree:");
        printTree(result);
    }
    public static void printTree(TreeNode root){
        if(root == null){
            return ;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
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
    public TreeNode searchBST(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val < root.val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }
}
