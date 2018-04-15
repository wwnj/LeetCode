package distributeCandies575;

import java.util.*;

/**
 * Created by wb on 2017/12/19.
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int candy:candies)
            map.put(candy,map.getOrDefault(candy,0)+1);
        Collection<Integer> collection = map.values();
        List<Integer> list = new ArrayList<>(collection);
        list.sort(null);
        int sum = 0;
        int average = candies.length/2;
        for(int i=0;i<list.size();i++){
            --average;
            ++sum;
            if(average==0){
                return sum;
            }
        }
        return sum;
    }
}
