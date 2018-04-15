package findAllAnagramsInAString438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wb on 2018/1/9.
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] goal = p.toCharArray();
        Arrays.sort(goal);
        String gStr = new String(goal);
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();++i){
            if(!p.contains(new String(new char[]{s.charAt(i)})))continue;
            char[] temp = s.substring(i,p.length()+i).toCharArray();
            Arrays.sort(temp);
            String tStr = new String(temp);
            if(gStr.compareTo(tStr)==0)
                result.add(i);
        }
        return result;
    }
}
