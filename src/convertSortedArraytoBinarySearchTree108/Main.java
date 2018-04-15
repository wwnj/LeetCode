package convertSortedArraytoBinarySearchTree108;

import utils.PrintTreeNode;
import utils.TreeNode;

/**
 * Created by wb on 2017/12/14.
 */
public class Main {
    public static void main(String[] args){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-3);
        root.left.left = new TreeNode(-10);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(9);
        PrintTreeNode.printTree(root);
        int[] nums = {-10,-3,0,5,9};

        Solution solution = new Solution();
        TreeNode t = solution.sortedArrayToBST(nums);
        PrintTreeNode.printTree(t);
    }
}
