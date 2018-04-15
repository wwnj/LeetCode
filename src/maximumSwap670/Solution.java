package maximumSwap670;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wb on 2018/3/1.
 */
public class Solution {
    public int maximumSwap(int num) {
        List<Integer> list = new ArrayList<>();
        while(num!=0){
            list.add(num%10);
            num=num/10;
        }
        Integer[] nums = new Integer[list.size()];
        int[] origin = new int[list.size()];
        for(int i=0;i<list.size();++i) {
            nums[i] = list.get(i);
            origin[i] = list.get(i);
        }
        Arrays.sort(nums, (o1, o2) -> o2-o1);
        int first = -1;
        int second = -1;
        for(int i=0;i<nums.length;++i) {
            if (nums[i] != origin[nums.length-1-i]) {
                first = nums.length-1-i;
                break;
            }
        }
        if(first!=-1){
            for(int i=first-1;i>=0;--i){
                if(origin[i]==nums[nums.length-first-1]) {
                    while(i>0){
                        boolean flag=true;
                        if(origin[i-1]==origin[i]){
                            --i;
                            flag=false;
                        }
                        if(flag)break;
                    }
                    int temp = origin[first];
                    origin[first]=origin[i];
                    origin[i]=temp;
                    break;
                }
            }
        }
        int result=0;
        int mi = origin.length-1;
        for (int i=origin.length-1;i>=0;--i) {
            result += origin[i] * Math.pow(10, mi);
            --mi;
        }
        return result;
    }
}
