import java.util.*;
public class BinaryTLevelTreeorderii {
    public static void main(String [] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution s = new Solution();
        List<List<Integer>> ans = s.LevelOrder(root);
        System.out.println(ans);
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
    public List<List<Integer>> LevelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = queue.remove();
                level.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            ans.add(0, level); // bottom up level order traversal 
        }
        return ans;
    }
}
