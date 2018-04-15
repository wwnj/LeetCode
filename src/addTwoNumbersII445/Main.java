package addTwoNumbersII445;

import utils.ListNode;

/**
 * Created by wb on 2018/1/16.
 */
public class Main {
    public static void main(String[] args){
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1,l2);
        while(result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
