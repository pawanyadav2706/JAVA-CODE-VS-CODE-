public class MaxDepthBT {
    public static void main(String [] args){
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        System.out.println(sol.maxdepthtree(root)); 
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
    public int maxdepthtree(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxdepthtree(root.left);
        int right = maxdepthtree(root.right); 

        int depth = Math.max(left, right) + 1;

        return depth;
    }
}
