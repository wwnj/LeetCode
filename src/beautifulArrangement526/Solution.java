package beautifulArrangement526;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wb on 2018/3/6.
 */
public class Solution {
    public int countArrangement(int N) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        int index = 1;
        count += backtrack(set,N,index);
        return count;
    }

    private int backtrack(Set<Integer> set,int N,int index){
        int count = 0;
        if(index>N)return ++count;
        for(int i=1;i<=N;++i){
            if(!set.contains(i)){
                if(i%index==0 || index%i==0){
                    set.add(i);
                    count += backtrack(set,N,++index);
                    --index;
                    set.remove(i);
                }
            }
        }
        return count;
    }
}
