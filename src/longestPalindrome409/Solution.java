package longestPalindrome409;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wb on 2017/12/27.
 */
public class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] cArray = s.toCharArray();
        for(char c:cArray)
            map.put(c,map.getOrDefault(c,0)+1);
        int res=0,count=0;
        for(int i:map.values()){
            res += i;
            if(i%2==1){
                ++count;
            }
        }
        if(count>0)res = res-count+1;
        return res;
    }
}
