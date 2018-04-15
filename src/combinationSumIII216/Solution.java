package combinationSumIII216;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/1/5.
 */
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if(k>n || k==0 || n==0 || k*(k+1)/2>n)return result;
        List<Integer> tempList = new ArrayList<>();
        while(true){
            for(int i=1;i<k;++i){
                tempList.add(i);
            }
            tempList.add(n - (k-1)*k/2);
            result.add(tempList);
            if(tempList.get(k-1)-tempList.get(k-2)<2) {
                break;
            }
            tempList.clear();

        }
        return result;
    }
}
