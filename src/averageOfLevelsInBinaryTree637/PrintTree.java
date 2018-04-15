package averageOfLevelsInBinaryTree637;

/**
 * Created by wb on 2017/11/24.
 */
public class PrintTree {
    public static void InorderTreeWalk(TreeNode root){
        if(root!=null){
            if(root.left!=null){
                InorderTreeWalk(root.left);
            }
            System.out.println(root.val);
            if(root.right!=null){
                InorderTreeWalk(root.right);
            }
        }
    }
}
