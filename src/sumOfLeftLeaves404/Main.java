package sumOfLeftLeaves404;

/**
 * Created by wb on 2017/11/26.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        root.left = left1;
        root.right = right1;
//        TreeNode left21 = new TreeNode(15);
//        TreeNode right21 = new TreeNode(17);
//        left1.left = left21;
//        left1.right = right21;

        TreeNode left22 = new TreeNode(15);
        TreeNode right22 = new TreeNode(7);
        right1.left = left22;
        right1.right = right22;

        PrintTree.InorderTreeWalk(root);
//        String str1= "123";
//        String str2=str1;
//        str2+="123";
//        System.out.println(str1);
//        System.out.println(str2);
        System.out.println("*************");

        Solution solution = new Solution();
        System.out.println(solution.sumOfLeftLeaves(root));
    }
}
