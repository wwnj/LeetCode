package convertBSTtoGreaterTree538;


/**
 * Created by wb on 2017/11/26.
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        if(root!=null){
            if(root.right!=null){
                convertBST(root.right);
                root.val += root.right.val;
            }
            if(root.left!=null){
                convertBST(root.left);
                root.left.val += root.val+root.right.val;
            }
        }
        return root;
    }
    private int localSumBST(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.right!=null){
            localSumBST(root.right);
            return root.right.val;
        }
        if(root.left!=null) localSumBST(root.left);
        return 0;
    }
}