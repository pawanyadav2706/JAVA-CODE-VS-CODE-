import java.util.*;
public class BTLevelTraversal {
    public static void main(String [] args){
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrder(root);
        System.out.println(result);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0; i< size; i++){
                TreeNode node = queue.remove();
                level.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
