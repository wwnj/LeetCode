package evaluateDivision399;

import java.util.Arrays;

/**
 * Created by wb on 2018/3/5.
 */
public class Main {
    public static void main(String[] args){
        String[][] equations = {{"a", "b"}, {"b", "c"}};
        double[] values = {2.0, 3.0};
        String[][] queries = {{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.calcEquation(equations, values, queries)));
    }
}
