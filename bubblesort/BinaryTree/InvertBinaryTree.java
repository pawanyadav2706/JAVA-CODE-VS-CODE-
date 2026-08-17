import java.util.*;
public class InvertBinaryTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(4);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		Solution sol = new Solution();
		TreeNode result = sol.invertbinarytree(root);
		printtree(result);
	}
	public static void printtree(TreeNode node) {
		if(node == null) {
			return ;
		}
		System.out.println(node.val);
		printtree(node.left);
		printtree(node.right);
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
    public TreeNode invertbinarytree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = invertbinarytree(root.left);
        TreeNode right = invertbinarytree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
