package subarraySumEqualsK560;

import java.util.Arrays;

/**
 * Created by wb on 2018/2/28.
 */
public class Solution {

    private int count = 0;

    private int start = 0;

    public int subarraySum(int[] nums, int k) {
        backtrack(nums,k,0,0);
        return count;
    }

    private void backtrack(int[] nums,int target,int total,int index){
        /*if(total>target){
            do{
                total -= nums[start];
                ++start;
            }while(total>target);
            backtrack(nums,target,total,index);
        }
        else if(total==target){
            ++count;
            total -= nums[start];
            ++start;
            backtrack(nums,target,total,index);
        }
        else{
            for(int i=index;i<nums.length;++i){
                total+=nums[i];
                backtrack(nums,target,total,i+1);
            }
        }*/
        if(index>=nums.length)return;
        boolean flag = true;
        for(int i=index;i<nums.length;++i){
            total+=nums[i];
            if(total>target){
                do{
                    total -= nums[start];
                    ++start;
                }while(total>target && start<=i);
                /*backtrack(nums,target,total,i+1);
                break;*/
                flag = false;
            }
            if(start<nums.length && total==target){
                ++count;
                total -= nums[start];
                ++start;
                backtrack(nums,target,total,i+1);
                flag = false;
                break;
            }
        }
        if(flag)
            backtrack(nums,target,0,index+1);
    }
}
