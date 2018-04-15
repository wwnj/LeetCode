package invertBinaryTree226;

import java.util.List;

/**
 * Created by wb on 2017/11/26.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(7);
        root.left = left1;
        root.right = right1;

        TreeNode left21 = new TreeNode(1);
        TreeNode right21 = new TreeNode(3);
        left1.left = left21;
        left1.right = right21;

        TreeNode left22 = new TreeNode(6);
        TreeNode right22 = new TreeNode(9);
        right1.left = left22;
        right1.right = right22;
        PrintTree.InorderTreeWalk(root);
        System.out.println("*************");

        Solution solution = new Solution();
        TreeNode t = solution.invertTree(root);
        PrintTree.InorderTreeWalk(t);

    }
}
