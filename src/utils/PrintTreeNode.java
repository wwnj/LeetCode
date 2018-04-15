package utils;

/**
 * Created by wb on 2017/12/14.
 */
public class PrintTreeNode {
    public static void printTree(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            if(root.left!=null) printTree(root.left);
            if(root.right!=null) printTree(root.right);
        }
    }
}
