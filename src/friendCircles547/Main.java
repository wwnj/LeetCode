package friendCircles547;

/**
 * Created by wb on 2018/1/27.
 */
public class Main {

    public static void main(String[] args){
        int[][] M = {{1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1}};
        Solution solution = new Solution();
        System.out.println(solution.findCircleNum(M));
    }
}
