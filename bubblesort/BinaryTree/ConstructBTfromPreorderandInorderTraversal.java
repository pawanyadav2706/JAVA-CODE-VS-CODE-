import java.util.*;

public class ConstructBTfromPreorderandInorderTraversal {

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Solution sol = new Solution();

        // Tree construct karna
        TreeNode root = sol.buildTree(preorder, inorder);

        // LeetCode jaisa output
        printTree(root);
    }

    public static void printTree(TreeNode root) {

        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if (current == null) {
                result.add("null");
            } else {

                result.add(String.valueOf(current.val));

                queue.offer(current.left);
                queue.offer(current.right);
            }
        }

        // Last ke unnecessary null remove karna
        while (result.get(result.size() - 1).equals("null")) {
            result.remove(result.size() - 1);
        }

        System.out.println(result);
    }
}


// TreeNode
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


// Solution
class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Base condition
        if (preorder.length == 0) {
            return null;
        }

        // Preorder ka first element = root
        int root = preorder[0];

        // Inorder me root ka index find karo
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {

            if (inorder[i] == root) {
                index = i;
                break;
            }
        }

        // Root node create
        TreeNode node = new TreeNode(root);

        // Left subtree
        node.left = buildTree(
                Arrays.copyOfRange(preorder, 1, index + 1),
                Arrays.copyOfRange(inorder, 0, index)
        );

        // Right subtree
        node.right = buildTree(
                Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length)
        );

        return node;
    }
}