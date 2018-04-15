package reverseLinkedList206;

import utils.ListNode;

import java.util.Stack;

/**
 * Created by wb on 2018/1/16.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode result = null;
        ListNode temp = null;
        while(!stack.empty()){
            if(result == null){
                result = new ListNode(stack.pop().val);
                temp = result;
            }else{
                temp.next = new ListNode(stack.pop().val);
                temp = temp.next;
            }
        }

        return result;
    }
}
