package convertSortedListToBinarySearchTree109;

import utils.ListNode;
import utils.TreeNode;

/**
 * Created by wb on 2018/1/18.
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            ++length;temp=temp.next;
        }
        int[] nums = new int[length];
        temp = head;
        int index = 0;
        while(temp!=null){
            nums[index++]=temp.val;
            temp=temp.next;
        }
        TreeNode root = null;
        root = addToBST(null,nums,0,nums.length-1);
        return root;
    }

    private TreeNode addToBST(TreeNode root,int[] nums,int low,int high){
        if(high<low)return null;
        int mid = (high+1-low)/2+low;
        root = new TreeNode(nums[mid]);
        if(mid>low)root.left = addToBST(root.left,nums,low,mid-1);
        if(mid<high)root.right = addToBST(root.right,nums,mid+1,high);
        return root;
    }
}
