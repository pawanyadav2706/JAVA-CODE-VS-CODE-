import java.util.*;
public class MinimumAbsoluteDifferenceinBST {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(0);
        root.right = new TreeNode(48);

        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(49);

        Solution sol = new Solution();
        System.out.println(sol.getMinimumDifference(root));
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
   public int getMinimumDifference(TreeNode root){
    ArrayList<Integer> list = new ArrayList<>();
    inorder(root,list);

    int ans = Integer.MAX_VALUE;
    for(int i =  1; i<list.size(); i++){
        int diff = list.get(i) - list.get(i - 1);
        ans = Math.min(ans, diff);
    }
    return ans;
    
   }
   public void inorder(TreeNode root, ArrayList<Integer> list ){
    if(root == null){
        return ;
    }
    inorder(root.left, list);
    list.add(root.val);
    inorder(root.right, list);
   }
  
}
