import java.util.*;
public class BinaryTreePath{
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println(sol.binaryTreePaths(root));
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Solution {
    public List<String> binaryTreePaths(TreeNode root){
        List<String> ans = new ArrayList<>();
        helper(root, "", ans);
        return ans;
    }
    void helper(TreeNode root, String path,List<String> ans){
        if(root == null){
            return;
        }
        if(path.equals("")){
            path = String.valueOf(root.val);
        }else{
            path = path + "->" +  root.val;
        }

        if(root.left == null && root.right == null){
            ans.add(path);
            return;
        }
        // left subtree
        helper(root.left, path, ans);
        // right subtree
        helper(root.right, path, ans);
    }
}