package fourSum18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wb on 2018/1/11.
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<4)return result;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-4;++i){
            int sum = nums[i]+nums[i+1]+nums[i+2];
            if(target-sum==nums[i+3]){
                List<Integer> temp = new ArrayList<>();
                for(int j=i;j<=i+3;++j)
                    temp.add(nums[j]);
                result.add(temp);
                int index = i+4;
                while(index<nums.length){
                    if(nums[index++]==nums[i+3])
                        result.add(temp);
                    else
                        break;
                }
            }else if(target-sum>nums[i+3]){

            }
        }
        return result;
    }
}
