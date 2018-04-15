package minimunPathSum64;

/**
 * Created by wb on 2018/1/31.
 */
public class Main {
    public static void main(String[] args){
        int[][] grid = { {1,3,1},
                         {1,5,1},
                         {4,2,1}};
        Solution solution = new Solution();
        System.out.println(solution.minPathSum(grid));
    }
}
