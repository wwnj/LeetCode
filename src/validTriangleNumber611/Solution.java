package validTriangleNumber611;

import java.util.Arrays;

/**
 * Created by wb on 2018/2/26.
 */
public class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i=0;i<nums.length-2;++i){
            for(int j=i+1;j<nums.length-1;++j){
                for(int k=j+1;k<nums.length;++k){
                    if(nums[i]+nums[j]>nums[k]){
                        ++result;
                    }else{
                        break;
                    }
                }
            }
        }
        return result;
    }
}
