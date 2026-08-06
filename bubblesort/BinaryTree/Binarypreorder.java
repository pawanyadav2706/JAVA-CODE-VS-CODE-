import java.util.*;
public class  Binarypreorder{
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution s  = new Solution();
        System.out.println(s.preorderTraversal(root));
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
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }
    public void preorder(TreeNode node,List<Integer> result ){
        if(node == null){
            return;
        }
        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
    }
}
