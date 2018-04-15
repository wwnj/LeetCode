package longestHarmoniousSubsequence594;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb on 2018/1/5.
 */
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        Integer[] IntArray = map.keySet().toArray(new Integer[0]);
        Arrays.sort(IntArray);
        int result = 0;
        for(int i=0;i<IntArray.length-1;++i){
            if(IntArray[i+1]-IntArray[i]==1){
                int sum = map.get(IntArray[i])+map.get(IntArray[i+1]);
                result = result>sum?result:sum;
            }
        }
        return result;
    }
}
