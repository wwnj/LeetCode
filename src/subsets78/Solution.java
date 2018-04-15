package subsets78;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/2/15.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        List<Integer> temp = new ArrayList<>();
        backtrack(result,nums,temp,index);
        return result;
    }

    private void backtrack(List<List<Integer>> result,int[] nums,List<Integer> temp,int index){
        if(index>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        backtrack(result,nums,temp,++index);
        --index;
        temp.add(nums[index]);
        backtrack(result,nums,temp,++index);
        --index;
        temp.remove(temp.indexOf(nums[index]));
    }
}
