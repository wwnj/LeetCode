package trimABinarySearchTree669;

/**
 * Created by wb on 2017/11/24.
 */
class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root.val<L){
            if(root.right!=null){
                root=trimBST(root.right,L,R);
            }else{
                return null;
            }
        }
        if(root.val>R){
            if(root.left!=null){
                root=trimBST(root.left,L,R);
            }else{
                return null;
            }
        }
        if(root.left!=null){
            root.left=trimBST(root.left,L,R);
        }
        if(root.right!=null){
            root.right=trimBST(root.right,L,R);
        }
        return root;
    }
}
