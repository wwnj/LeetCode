package redundantConnection684;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wb on 2018/1/25.
 */
public class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        int need = 0;
        for(int[] edge:edges){
            int count = 0;
            for(int i:edge){
                if(!set.contains(i)){
                    set.add(i);
                }else{
                    ++need;
                    ++count;
                }
                if(count==2 && need>=3)
                    return edge;
            }
        }
        return new int[]{};
    }
}
