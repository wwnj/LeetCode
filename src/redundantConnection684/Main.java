package redundantConnection684;

/**
 * Created by wb on 2018/1/25.
 */
public class Main {
    public static void main(String[] args){
        int[][] edges = {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}};
        Solution solution = new Solution();
        for(int i:solution.findRedundantConnection(edges))
            System.out.print(i+" ");
    }
}
