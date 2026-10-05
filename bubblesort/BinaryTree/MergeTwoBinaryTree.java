import java.util.*;
public class MergeTwoBinaryTree {
    public static void main(String [] args){
        // ROOT 1
          TreeNode root1 = new TreeNode(1);

        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);


        // ROOT 2
        TreeNode root2 = new TreeNode(2);

        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);


        // Solution object
        Solution sol = new Solution();

        // Merge both trees
        TreeNode result = sol.mergeTrees(root1, root2);

        // Print merged tree
        printTree(result);
    }


    // Print tree using Level Order
    public static void printTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node == null) {
                System.out.print("null ");
                continue;
            }

            System.out.print(node.val + " ");

            queue.add(node.left);
            queue.add(node.right);
        }
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        root1.val = root1.val + root2.val;

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
