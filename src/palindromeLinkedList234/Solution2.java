package palindromeLinkedList234;

import utils.ListNode;

/**
 * Created by wb on 2018/1/18.
 * 异或不能解决这道题目 [1,3,0,2]
 */
public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        int num = 0;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            ++length;
            num = num^temp.val;
            temp=temp.next;
        }
        if(length%2==0){
            return num == 0;
        }else{
            temp = head;
            int mid = 0,count=0;
            while(temp!=null){
                ++count;
                if(count == length/2+1){
                    mid = temp.val;
                    break;
                }
                temp=temp.next;
            }
            return num == mid;
        }
    }
}
