package trimABinarySearchTree669;

/**
 * Created by wb on 2017/11/24.
 */
public class Main {
    public static  void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(2);
        root.left=left;
        root.right=right;
        Solution solution = new Solution();
        root = solution.trimBST(root,1,2);
        PrintTree.InorderTreeWalk(root);
    }
}
