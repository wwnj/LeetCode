package twoSumIV_InputIsABST653;

/**
 * Created by wb on 2017/11/26.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(6);
        root.left = left1;
        root.right = right1;

        TreeNode left21 = new TreeNode(2);
        TreeNode right21 = new TreeNode(4);
        left1.left = left21;
        left1.right = right21;

        //TreeNode left22 = new TreeNode(6);
        TreeNode right22 = new TreeNode(7);
        //right1.left = left22;
        right1.right = right22;

        int target = 9;

        PrintTree.InorderTreeWalk(root);
        System.out.println("*************");

        Solution solution = new Solution();
        System.out.println(solution.findTarget(root,target));
    }
}
