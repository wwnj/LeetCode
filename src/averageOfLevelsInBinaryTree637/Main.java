package averageOfLevelsInBinaryTree637;

import java.util.List;

/**
 * Created by wb on 2017/11/24.
 */
public class Main {
    public static  void main(String[] args){
//        TreeNode root = new TreeNode(3);
//        TreeNode left = new TreeNode(9);
//        TreeNode right = new TreeNode(20);
//        TreeNode t1 = new TreeNode(15);
//        TreeNode t2 = new TreeNode(7);
//        root.left=left;
//        root.right=right;
//        right.left=t1;
//        right.right=t2;
        TreeNode root = new TreeNode(3);
        TreeNode right1 = new TreeNode(30);
        root.right=right1;
        TreeNode left2 = new TreeNode(10);
        right1.left = left2;
        TreeNode right3 = new TreeNode(15);
        left2.right =right3;
        TreeNode right4 = new TreeNode(45);
        right3.right=right4;
        PrintTree.InorderTreeWalk(root);

        Solution solution = new Solution();
        List<Double> list = solution.averageOfLevels(root);
        System.out.println(list);

    }
}
