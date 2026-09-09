public class RangeSuminBST {
    public static void main(String [] args){
        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(3);
        root.right = new TreeNode(4);


        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(9);

        Solution sol = new Solution();
        System.out.println(sol.rangeSumBST(root, 2, 4));
        
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
    public int rangeSumBST(TreeNode root, int low , int high){
        if(root == null){
            return 0;
        }
        if(root.val <  low){
            return rangeSumBST(root.right, low, high);
        }
        if(root.val > high){
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
