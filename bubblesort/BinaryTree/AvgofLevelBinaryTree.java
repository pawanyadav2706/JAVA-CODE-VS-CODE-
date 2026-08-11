import java.util.*;
public class AvgofLevelBinaryTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution s = new Solution();
        List<Double> averages = s.averageoflevels(root);
        System.out.println(averages);
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
    public List<Double> averageoflevels(TreeNode root){
        List<Double> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double averagelevel = 0;
            for(int i = 0; i<size; i++){
                TreeNode node = queue.remove();
                averagelevel += node.val;

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            averagelevel = averagelevel / size;
            ans.add(averagelevel);
        }
        return ans;
    }
}
