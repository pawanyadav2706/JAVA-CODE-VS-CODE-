import java.util.*;
public class BTPreorderandPostorderTraversal {
    public static void main(String [] args){
        int [] preorder = {1,2,4,5,3,6,7};
        int [] postorder = {4,5,2,6,7,3,1};

        Solution sol = new Solution();
        TreeNode root1 = sol.constructFromPrePost(preorder, postorder);
        System.out.println("preorder");
        printpreorder(root1);
        System.out.println();

        System.out.println("postorder");
        printpostorder(root1);

    }
    public static void printpreorder(TreeNode root1){
        if(root1 == null){
            return ;
        }
        System.out.println(root1.val + " ");
        printpreorder(root1.left);
        printpreorder(root1.right);
    }
    public static void printpostorder(TreeNode root1){
        if(root1 == null){
            return ;
        }
        printpostorder(root1.left);
        printpostorder(root1.right);
        System.out.println(root1.val + " ");
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val){
        this.val = val;
    }
}
class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder){
        if(preorder.length == 0){
            return null;
        }
        int root = preorder[0];
        TreeNode node = new TreeNode(root);
        if(preorder.length == 1){
            return node;
        }
        int leftroot = preorder[1];
        // find root form postorder
        int index = 0;
        for(int i =0; i< postorder.length; i++){
            if(postorder[i] == leftroot){
                index = i;
            }
        }
        int leftsize = index + 1;
        node.left = constructFromPrePost(Arrays.copyOfRange(preorder, 1, leftsize + 1), Arrays.copyOfRange(postorder, 0, leftsize));
        node.right = constructFromPrePost(Arrays.copyOfRange(preorder, leftsize + 1, preorder.length),Arrays.copyOfRange(postorder, leftsize, postorder.length - 1));

        return node;

    }
}
