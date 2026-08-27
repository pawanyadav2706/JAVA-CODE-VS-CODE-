import java.util.*;
public class Pathsumii {
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);
		
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		
		root.left.left.left = new TreeNode(7);
		root.left.left.right  = new TreeNode(2);
		
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		
		root.right.right.right = new TreeNode(1);
		
		Solution sol = new Solution();
        System.out.println(sol.pathSum(root, 22));
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        helper(root, targetSum, path, ans);
        return ans;
    } 
   public void helper(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans){
        if(root == null){
            return ;
        }
        path.add(root.val);
        if(root.val == targetSum && root.left == null && root.right == null){
            ans.add(new ArrayList<>(path));
        }
        helper(root.left, targetSum - root.val, path, ans);
        helper(root.right, targetSum - root.val, path, ans);

        path.remove(path.size() - 1);
    }
}
