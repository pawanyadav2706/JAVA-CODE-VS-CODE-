import java.util.*;
public class MaximumDepthofNaryTree {

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(4);
        root.right = new Node(6);

        Solution sol = new Solution();

        System.out.println(sol.maxdepthpath(root));
    }
}

class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class Solution {

    public int maxdepthpath(Node root) {

        if (root == null) {
            return 0;
        }

        int left = maxdepthpath(root.left);
        int right = maxdepthpath(root.right);

        return Math.max(left, right) + 1;
    }
}