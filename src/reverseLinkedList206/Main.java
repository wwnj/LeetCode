package reverseLinkedList206;

import utils.ListNode;

/**
 * Created by wb on 2018/1/16.
 */
public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
