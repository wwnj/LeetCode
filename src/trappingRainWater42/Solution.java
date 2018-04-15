package trappingRainWater42;

/**
 * Created by wb on 2018/1/15.
 */
public class Solution {
    public int trap(int[] height) {
        int[] border = new int[2];
        boolean flag = true;
        for(int i:height){
            if(flag){
                if(i>0){
                    border[0]=border[0]>i?border[0]:i;
                }else{
                    flag = false;
                }
            }else{

            }
        }
        return 0;
    }
}
