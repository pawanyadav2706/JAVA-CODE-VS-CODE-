import java.util.*;
public class SortedArrayBinarySearchTree {
    public static void main(String [] args){
        int [] nums = {-10,-3,0,5,9};
        Solution sol = new Solution();
        TreeNode root = sol.sortedArrayToBST(nums);
        inorder(root);
    }
    static void inorder(TreeNode root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.val + " ");
        inorder(root.right);
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
// ask in google and my accrding to my sesigiation this quetion is very important
class Solution {
    public TreeNode sortedArrayToBST(int[] nums){
        return popoulatedsorted(nums, 0 , nums.length - 1);
    }
    private TreeNode popoulatedsorted(int [] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = popoulatedsorted(nums, start, mid - 1);
        root.right = popoulatedsorted(nums, mid + 1, end);

        return root;
    }
}

