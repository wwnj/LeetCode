package reserveNodesInKGroup25;

import utils.ListNode;

import java.util.Stack;

/**
 * Created by wb on 2018/1/19.
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1)return head;
        ListNode temp = head;
        ListNode partHead = null;
        Stack<ListNode> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
            if(stack.size()==k){
                while(!stack.empty()){
                    if(partHead==null){
                        partHead=stack.pop();
                        head=partHead;
                    }else{
                        partHead.next=stack.pop();
                        partHead=partHead.next;
                    }
                }
            }
        }
        if(!stack.empty()){
            if(partHead==null){
                return head;
            }else{
                while(!stack.empty())temp=stack.pop();
                partHead.next=temp;
                return head;
            }
        }
        if(partHead!=null)
            partHead.next=null;
        return head;
    }
}
