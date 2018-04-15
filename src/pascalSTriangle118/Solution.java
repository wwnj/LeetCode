package pascalSTriangle118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/3/1.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lastRow = new ArrayList<>();
        for(int i=1;i<=numRows;++i){
            List<Integer> temp = new ArrayList<>();
            for(int j=1;j<=i;++j){
                if(j==1)
                    temp.add(1);
                else if(j==i)
                    temp.add(1);
                else{
                    temp.add(lastRow.get(j-2)+lastRow.get(j-1));
                }
            }
            lastRow=temp;
            result.add(lastRow);
        }
        return result;
    }
}
