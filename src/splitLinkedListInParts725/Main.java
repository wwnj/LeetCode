package splitLinkedListInParts725;

/**
 * Created by wb on 2018/1/16.
 */
public class Main {
    public static void main(String[] args){
        ListNode temp = new ListNode(1);
        ListNode root = temp;
        for(int i=2;i<11;++i){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        Solution solution = new Solution();
        int k = 3;
        for(ListNode listNode:solution.splitListToParts(root,k)){
            while(listNode!=null){
                System.out.print(listNode.val+" ");
                listNode = listNode.next;
            }
            System.out.println();
        }
    }
}
