package splitLinkedListInParts725;

/**
 * Created by wb on 2018/1/16.
 */
public class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode temp = root;
        int sum = 0;
        while(temp!=null){
            ++sum;
            temp = temp.next;
        }
        int length = sum/k;
        ListNode[] result = new ListNode[k];
        int count = sum -length*k;
        temp = root;
        for(int i=0;i<k;++i){
            int size = length;
            if(count>0){
                ++size;
                --count;
            }
            ListNode temp2 = null;
            while (size > 0) {
                if(temp == null){
                    result[i] = null;
                }
                if(result[i]==null) {
                    temp2 = new ListNode(temp.val);
                    result[i] = temp2;
                }
                else{
                    temp2.next = new ListNode(temp.val);
                    temp2 = temp2.next;
                }
                temp = temp.next;
                --size;
            }

        }
        return result;
    }
}
