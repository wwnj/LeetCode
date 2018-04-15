package findPivotIndex724;

/**
 * Created by wb on 2018/3/1.
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int[] sums = new int[nums.length];
        for(int i=0;i<sums.length;++i){
            if(i==0)
                sums[i]=nums[i];
            else
                sums[i]=sums[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;++i){
            if(i==0) {
                if (sums[nums.length - 1] - nums[0] == 0)
                    return 0;
            }
            else if(sums[i-1]==sums[nums.length-1]-sums[i])
                return i;
        }
        return -1;
    }
}
