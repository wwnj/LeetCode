package subarraySumEqualsK560;

/**
 * Created by wb on 2018/2/28.
 */
public class Main {
    public static void main(String[] args){
        /*int[] nums = {-174,703,438,871,-241,781,429,-215,177,273,-628,106,
                235,-410,145,-793,-451,913,807,596,-982,709,585,-629,966,
                623,947,-467,-405,552,-858,8,-252,-128,-659,-233,-836,588,
                324,-817,175,-329,510,-388,878,398,231,730,66,-528,857,383,
                928,-924,199,-750,-868,-652,-133,408,391,685,483,-31,-986,945,
                271,778,-96,677,-961,-130,990,-891,-431,-317,-676,479,-919,-20,
                -814,3,-89,34,-292,548,201,-119,-94,-442,-934,-491,208,-722,
                115,527,73,636,-681,857};
        int k = -469;*/
        int[] nums = {28,54,7,-70,22,65,-6};
        int k = 100;
        Solution solution = new Solution();
        System.out.println(solution.subarraySum(nums,k));
    }
}