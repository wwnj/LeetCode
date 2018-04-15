package palindromeLinkedList234;

import utils.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by wb on 2018/1/18.
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode temp = head;
        while (temp != null) {
            deque.addLast(temp);
            temp = temp.next;
        }
        while (deque.size() > 1) {
            if (deque.removeFirst().val != deque.removeLast().val) return false;
        }
        return true;
    }
}
