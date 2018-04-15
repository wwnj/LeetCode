package TopKFrequentElements347;

import java.util.*;

/**
 * Created by wb on 2017/12/24.
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        Integer[] valArray = map.values().toArray(new Integer[0]);
        Arrays.sort(valArray);
        List<Integer> valList = new ArrayList<>();
        for(int i=valArray.length-1;valArray.length-1-i<k;--i)
            valList.add(valArray[i]);
        List<Integer> res = new ArrayList<>();
        for(int i:map.keySet())
            if(valList.contains(map.get(i)))
                res.add(i);
        return res;
    }
}
