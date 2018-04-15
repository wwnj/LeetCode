package arrayNesting565;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wb on 2018/1/4.
 */
public class Solution {
    public int arrayNesting(int[] nums) {
        int max=0;
        int index=0;
        Set<Integer> usedSet = new HashSet<>();
        while(index<nums.length){
            if(usedSet.contains(index)){
                ++index;
                continue;
            }
            Set<Integer> set = new HashSet<>();
            int temp = index;
            int count = 0;
            while(!set.contains(nums[index])){
                usedSet.add(index);
                set.add(nums[index]);
                ++count;
                index = nums[index];
            }
            max = max>=count?max:count;
            index = temp;
            ++index;
        }
        return max;
    }
}
