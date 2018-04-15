package combinations77;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wb on 2018/3/7.
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int index = 1;
        backtrack(result,set,n,k,index);
        return result;
    }

    private void backtrack(List<List<Integer>> result,Set<Integer> set,int n,int k,int index){
        if(set.size()>=k){
            result.add(new ArrayList<>(set));
            return;
        }
        for(int i=index;i<=n;++i){
            if(!set.contains(i)) {
                set.add(i);
                backtrack(result,set,n,k,++i);
                --i;
                set.remove(i);
            }
        }
    }
}
