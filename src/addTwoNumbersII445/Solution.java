package addTwoNumbersII445;

import utils.ListNode;

import java.util.Stack;

/**
 * Created by wb on 2018/1/16.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        while(l1!=null){
            stack1.push(l1);
            l1=l1.next;
        }

        Stack<ListNode> stack2 = new Stack<>();
        while(l2!=null){
            stack2.push(l2);
            l2=l2.next;
        }

        ListNode temp1 = null;
        ListNode temp2 = null;

        int high = 0;
        while(!stack1.empty() || !stack2.empty()){
            int num1 = 0,num2 = 0;
            if(!stack1.empty())num1 = stack1.pop().val;
            if(!stack2.empty())num2 = stack2.pop().val;
            int sum = num1 + num2 + high;
            high = sum/10;
            sum = sum%10;
            if(temp1 == null){
                temp1 = new ListNode(sum);
                temp2 = temp1;
            }else{
                temp2.next = new ListNode(sum);
                temp2 = temp2.next;
            }
        }
        if(high == 1)temp2.next = new ListNode(1);

        ListNode result = null;
        ListNode temp3 = null;
        Stack<ListNode> stack3 = new Stack<>();
        while(temp1!=null){
            stack3.push(temp1);
            temp1=temp1.next;
        }

        while(!stack3.empty()){
            if(result==null){
                result = new ListNode(stack3.pop().val);
                temp3 = result;
            }else{
                temp3.next = new ListNode(stack3.pop().val);
                temp3 = temp3.next;
            }
        }

        return result;
    }
}
