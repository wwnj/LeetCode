package pascalSTriangleII119;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/3/1.
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lastRow = new ArrayList<>();
        for(int i=0;i<=rowIndex;++i){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;++j){
                if(j==0)
                    temp.add(1);
                else if(j==i)
                    temp.add(1);
                else{
                    temp.add(lastRow.get(j-1)+lastRow.get(j));
                }
            }
            lastRow=temp;
        }
        return lastRow;
    }
}
