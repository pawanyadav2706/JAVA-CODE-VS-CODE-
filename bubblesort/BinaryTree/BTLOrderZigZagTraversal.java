import java.util.*;
public class BTLOrderZigZagTraversal {
    public static void main(String [] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution s = new Solution();
        List<List<Integer>> ans = s.zigzaglevelorder(root);
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
    public List<List<Integer>> zigzaglevelorder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0; i<size; i++){
                if(!reverse){
                    TreeNode node = queue.removeFirst();
                    level.add(node.val);
                    if(node.left != null){
                        queue.addLast(node.left);
                    }
                    if(node.right != null){
                        queue.addLast(node.right);
                    }
                }else{
                    TreeNode node = queue.removeLast();
                    level.add(node.val);
                    if(node.right != null){
                        queue.addFirst(node.right);
                    }
                     if(node.left != null){
                        queue.addFirst(node.left);
                    }
                }
            }
            reverse = !reverse;
            ans.add(level);
        }
        return ans;

    }
}
