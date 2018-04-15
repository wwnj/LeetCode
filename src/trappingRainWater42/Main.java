package trappingRainWater42;

/**
 * Created by wb on 2018/1/15.
 */
public class Main {
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution solution = new Solution();
        System.out.println(solution.trap(height));
    }
}
