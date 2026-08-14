import java.util.*;
public class CousinsinBinaryTree {
    public static void main(String [] args){
        TreeNode root  = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
		
		Solution sol = new Solution();
		System.out.println(sol.isCousins(root, 4, 5));
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
    public boolean isCousins(TreeNode root, int x, int y){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean x1 = false;
            boolean y1 = false;
            for(int i =0; i<size; i++){
                TreeNode node = queue.remove();
                if(node.left != null && node.right != null){
                    if((node.left.val == x && node.right.val == y) ||
                        (node.left.val == y && node.right.val == x)){
                            return false;
                        }
                }
                // check x
                if(node.val == x){
                    x1 = true;
                }
                // check y
                if(node.val == y){
                    y1 = true;
                }

                if(node.left != null){
                    queue.add(node.left);
                }
            
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(x1 && y1){
                return true;
            }
            if(x1 || y1){
                return false;
            }
          
        }
          return false;
    }
}
