package swapNodesInParis24;

import utils.ListNode;

/**
 * Created by wb on 2018/1/17.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode result = even;
        ListNode last = null;
        while(odd!=null && even!=null){
            if(last == null){
                last = odd;
            }else{
                last.next = even;
            }
            odd.next = even.next;
            even.next = odd;
            odd = odd.next;
            if(odd!=null)
                even = odd.next;
        }
        return result;
    }
}
