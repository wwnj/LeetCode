package fourSum18;

/**
 * Created by wb on 2018/1/11.
 */
public class Main {
    public static void main(String[] args){
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        Solution solution = new Solution();
        System.out.println(solution.fourSum(nums,target));
    }
}
