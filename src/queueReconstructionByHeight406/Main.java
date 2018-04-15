package queueReconstructionByHeight406;

/**
 * Created by wb on 2018/1/10.
 */
public class Main {
    public static void main(String[] args){
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        Solution solution = new Solution();
        System.out.println(solution.reconstructQueue(people));
    }
}
