package sumOfLeftLeaves404;


/**
 * Created by wb on 2017/11/26.
 */
class Solution {
    private int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeaves(root,false);
        return sum;
    }
    private void sumOfLeftLeaves(TreeNode root,boolean flag){
        if(root==null){
            return;
        }
        if(flag){
            if(root.left==null && root.right==null){
                sum+=root.val;
            }
        }
        sumOfLeftLeaves(root.left,true);
        sumOfLeftLeaves(root.right,false);
    }
}