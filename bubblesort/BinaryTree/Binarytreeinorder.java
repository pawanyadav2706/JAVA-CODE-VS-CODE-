import java.util.*;
public class Binarytreeinorder {
    public static void main(String [] args){
        Treenode root = new Treenode(1);
        root.right = new Treenode(2);
        root.right.left = new Treenode(3);
        Solution s  = new Solution();
        System.out.println(s.inorderTraversal(root));
    }
}
class Treenode {
    int val;
    Treenode left;
    Treenode right;

    Treenode(int val) {
        this.val = val;
    }
}
class Solution {
    public List<Integer> inorderTraversal(Treenode root){
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    public void inorder(Treenode node,List<Integer> result ){
        if(node == null){
            return;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}
