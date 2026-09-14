import java.util.*;
public class NaryPostorderTraversal {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        root.children.add(new TreeNode(3));
        root.children.add(new TreeNode(2));
        root.children.add(new TreeNode(4));
        root.children.get(0).children.add(new TreeNode(5));
        root.children.get(0).children.add(new TreeNode(6));

        Solution sol  = new Solution();
        System.out.println(sol.postorder(root));
    }
}
class TreeNode {
    int val;
    List<TreeNode> children;
    TreeNode(int val){
        this.val = val;
        this.children = new ArrayList<>();
    }
}

class Solution {
    public List<Integer> postorder(TreeNode root ){
        List<Integer> ans = new ArrayList<>();
        solve(root,ans);
        return ans;
    }
    void solve(TreeNode root, List<Integer> ans){
        if(root == null){
            return ;
        }
        for(TreeNode child : root.children){
            solve(child, ans);
        }
        ans.add(root.val);
    }
}
