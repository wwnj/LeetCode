package findMinimumInRotatedSortedArray153;

import java.util.Arrays;

/**
 * Created by wb on 2017/11/23.
 */
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0 ;
        while (low <= high) {
            mid = (high - low) / 2 + low;
            if (nums[mid]<=nums[high]){
                break;
            }
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
        }
        mid--;
        while(mid>=0&&nums[mid]<nums[high]){
            mid--;
        }
        return nums[++mid];
    }
}