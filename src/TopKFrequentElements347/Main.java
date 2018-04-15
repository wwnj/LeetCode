package TopKFrequentElements347;

/**
 * Created by wb on 2017/12/24.
 */
public class Main {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Solution solution = new Solution();
        for(int i:solution.topKFrequent(nums,k))
            System.out.println(i);
    }
}
