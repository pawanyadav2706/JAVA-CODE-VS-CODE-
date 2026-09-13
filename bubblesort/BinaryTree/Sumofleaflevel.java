public class Sumofleaflevel {
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution s = new Solution();

        int sum = s.sumofleavel(root);
        
        System.out.println(sum);
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
    public int sumofleavel(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum  = sum + root.left.val;
        }
        sum = sum + sumofleavel(root.left);
        sum = sum + sumofleavel(root.right);
        return sum;
    }
}