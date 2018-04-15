package happyNumber202;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wb on 2018/1/5.
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
            int sum = 0;
            while(n/10!=0){
                sum += (n%10)*(n%10);
                n= n/10;
            }
            sum += n*n;
            if(sum == 1){
                return true;
            }
            n = sum;
        }
    }
}
