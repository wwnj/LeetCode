package spiralMatrixII59;

/**
 * Created by wb on 2018/2/28.
 */
public class Main {
    public static void main(String[] args){
        int n=3;
        Solution solution = new Solution();
        int[][] nums = solution.generateMatrix(n);
        for(int i=0;i<nums.length;++i){
            for(int j=0;j<nums[0].length;++j)
                System.out.println(nums[i][j]);
        }
    }
}
