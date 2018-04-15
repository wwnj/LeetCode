package palindromeLinkedList234;

import utils.ListNode;

/**
 * Created by wb on 2018/1/18.
 */
public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(2);
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(head));
    }
}
