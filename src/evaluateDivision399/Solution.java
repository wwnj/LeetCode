package evaluateDivision399;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb on 2018/3/5.
 */
public class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String[],Double> map = new HashMap<>();
        for(int i=0;i<equations.length;++i)
            map.put(equations[i],values[i]);
        System.out.println(map.size());
        System.out.println(map.containsKey(equations[0]));
        return null;
    }
}
