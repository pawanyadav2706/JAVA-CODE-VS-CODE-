import java.util.*;
public class Findpath {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.right = new TreeNode(5);

        // int [] arr = {1,2,5};
        int [] arr = {1,3};
        Solution sol = new Solution();
        System.out.println(sol.findpath(root, arr));
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
    public boolean findpath(TreeNode root, int [] arr){
        if(root == null){
            return arr.length == 0;
           
        }
        return helper(root, arr, 0);
    }
    private boolean helper(TreeNode root, int [] arr, int index){
        if(root == null){
            return false;
        }
        if(index >= arr.length || root.val != arr[index]){
                return false;
            }
            if(root.left == null && root.right == null && index == arr.length - 1){
                return true;
            }
            return helper(root.left, arr, index + 1) || helper(root.right, arr, index + 1);
        }
    }

