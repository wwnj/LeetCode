package convertSortedListToBinarySearchTree109;

import utils.ListNode;
import utils.PrintTreeNode;
import utils.TreeNode;

/**
 * Created by wb on 2018/1/18.
 */
public class Main {
    public static void main(String[] args){
        int[] nums ={-10,-3,0,5,9};
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        Solution solution = new Solution();
        TreeNode root = solution.sortedListToBST(head);
        PrintTreeNode.printTree(root);
    }
}
