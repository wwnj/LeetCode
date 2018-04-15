package largestNumberAtLeastTwiceOfOthers748;

/**
 * Created by wb on 2018/1/4.
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int index = -1;
        for(int i=0;i<nums.length;++i){
            secondMax = max<nums[i]?max:(nums[i]>secondMax?nums[i]:secondMax);
            if(max<nums[i]){
                max = nums[i];
                index = i;
            }
        }
        if(max==0)return -1;
        if(secondMax == 0){
            return index;
        }else if(max - 2*secondMax >=0){
            return index;
        }else{
            return -1;
        }
    }
}
