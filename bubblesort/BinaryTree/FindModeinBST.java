import java.util.*;
public class FindModeinBST {
    public static void main(String [] args){
        TreeNode root  = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        
        Solution sol  = new Solution();
        int [] pattern = sol.findMode(root);
        System.out.println(Arrays.toString(pattern));
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
class Solution{
    ArrayList<Integer> ans  = new ArrayList<>();
    Integer prev = null;
    int count = 0;
    int maxcount = 0;
    public int[] findMode(TreeNode root){
        inorder(root);

        int [] result  = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);

        if(prev == null || root.val != prev){
            count = 1;
        }else{
            count++;
        }
        if(count > maxcount){
            ans.clear();
            ans.add(root.val);
            maxcount = count;
        }else if(maxcount == count){
            ans.add(root.val);
        }
        prev = root.val;
        inorder(root.right);
    }
}
