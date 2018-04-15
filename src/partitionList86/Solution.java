package partitionList86;

import utils.ListNode;

/**
 * Created by wb on 2018/1/19.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head,firPart = null,secPart = null,firTemp=null,secTemp=null;
        while(temp!=null){
            if(temp.val<x){
                if(firPart==null){
                    firPart=temp;
                    firTemp=temp;
                }else{
                    firTemp.next = temp;
                    firTemp = firTemp.next;
                }
            }else{
                if(secPart==null){
                    secPart=temp;
                    secTemp=temp;
                }else{
                    secTemp.next = temp;
                    secTemp = secTemp.next;
                }
            }
            temp = temp.next;
        }
        if(firTemp!=null){
            firTemp.next = secPart;
        }
        if(secTemp!=null){
            secTemp.next=null;
        }
        return firPart!=null?firPart:secPart;
    }
}
