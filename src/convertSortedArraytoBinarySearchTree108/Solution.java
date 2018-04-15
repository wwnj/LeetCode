package convertSortedArraytoBinarySearchTree108;

import utils.TreeNode;

/**
 * Created by wb on 2017/12/14.
 */
public class Solution {
    TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)
            return null;
        TreeNode t = new TreeNode(0);
        addToBST(nums,t,0,nums.length/2,nums.length-1);
        return t;
    }
    private void addToBST(int[] nums,TreeNode t,int start,int mid,int end){
        t.val = nums[mid];
        if(mid != start){
            t.left = new TreeNode(0);
            addToBST(nums,t.left,start,(mid-start)/2+start,mid-1);
        }

        if(mid != end){
            t.right = new TreeNode(0);
            addToBST(nums,t.right,mid+1,(end-mid)/2+mid+1,end);
        }

    }
}
