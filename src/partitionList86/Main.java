package partitionList86;

import utils.ListNode;

/**
 * Created by wb on 2018/1/19.
 */
public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        int x = 2;
        Solution solution = new Solution();
        ListNode result = solution.partition(head,x);
        while(result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
