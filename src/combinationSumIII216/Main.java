package combinationSumIII216;

import java.util.List;

/**
 * Created by wb on 2018/1/5.
 */
public class Main {
    public static void main(String[] args){
        int k = 3,n = 9;
        Solution solution = new Solution();
        for(List<Integer> list:solution.combinationSum3(k,n))
            for(int i:list)
                System.out.println(i);
    }
}
