import java.util.*;
public class DiameterofBinaryTree {
    public static void main(String [] args){
        TreeNode root =  new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        root.right = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        Solution sol = new Solution();
        System.out.println(sol.diameterOfBinaryTree(root));
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        height(root);
        return diameter;
    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        diameter = Math.max(diameter,leftheight + rightheight);
        return Math.max(leftheight, rightheight) + 1;
    }
}
