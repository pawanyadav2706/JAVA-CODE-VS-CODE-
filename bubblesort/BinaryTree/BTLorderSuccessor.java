
import java.util.*;
public class BTLorderSuccessor {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Solution s = new Solution();
        TreeNode successor = s.findsuccessor(root, 2);
        if(successor != null){
            System.out.println(successor.val);
        }else{
            System.out.println("No successor found");
        }
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
    public TreeNode findsuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            if(node.val == key){
                break;
            }
        }
        return queue.peek();
    }
}