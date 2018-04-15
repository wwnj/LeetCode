package convertBSTtoGreaterTree538;

/**
 * Created by wb on 2017/11/26.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(13);
        root.left = left1;
        root.right = right1;
        TreeNode left21 = new TreeNode(1);
        TreeNode right21 = new TreeNode(3);
        left1.left = left21;
        left1.right = right21;

        TreeNode left22 = new TreeNode(11);
        TreeNode right22 = new TreeNode(14);
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
        PrintTree.InorderTreeWalk(solution.convertBST(root));
    }
}
