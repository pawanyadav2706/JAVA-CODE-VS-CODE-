import java.util.*;
public class LeafSimilarTrees {
    public static void main(String [] args){

        // TREE 1
		  TreeNode root1 = new TreeNode(3);

	        root1.left = new TreeNode(5);
	        root1.right = new TreeNode(1);

	        root1.left.left = new TreeNode(6);
	        root1.left.right = new TreeNode(2);

	        root1.left.right.left = new TreeNode(7);
	        root1.left.right.right = new TreeNode(4);

	        root1.right.left = new TreeNode(9);
	        root1.right.right = new TreeNode(8);


	        //  TREE 2 

	        TreeNode root2 = new TreeNode(3);

	        root2.left = new TreeNode(5);
	        root2.right = new TreeNode(1);

	        root2.left.left = new TreeNode(6);
	        root2.left.right = new TreeNode(7);

	        root2.right.left = new TreeNode(4);
	        root2.right.right = new TreeNode(2);

	        root2.right.right.left = new TreeNode(9);
	        root2.right.right.right = new TreeNode(8);


	        //  CHECK 

	        Solution sol = new Solution();

	        boolean ans = sol.leafSimilar(root1, root2);

	        System.out.println(ans);
        

    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        getleavs(root1, list1);
        getleavs(root2, list2);

        return list1.equals(list2);
    }
    void  getleavs(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        getleavs(root.left, list);
        getleavs(root.right, list);
    }
}
