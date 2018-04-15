package couplesHoldingHands765;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb on 2018/1/25.
 */
public class Solution {
    public int minSwapsCouples(int[] row) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<row.length;++i)
            map.put(row[i],i);
        int result = 0;
        for(int i=0;i<row.length;++i,++i){
            int small = row[i]<row[i+1]?row[i]:row[i+1];
            int bigger = row[i]+row[i+1]-small;
            if(small%2==1 || bigger-small!=1) {
                ++result;
                int goal = bigger%2==0?(bigger+1):(bigger-1);
                row[map.get(goal)]=small;
                map.put(small,map.get(goal));
            }
        }
        return result;
    }
}
