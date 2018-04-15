package reserveNodesInKGroup25;

import utils.ListNode;

/**
 * Created by wb on 2018/1/19.
 */
public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 3;
        Solution solution = new Solution();
        ListNode result = solution.reverseKGroup(head,k);
        while(result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
