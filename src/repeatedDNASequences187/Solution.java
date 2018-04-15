package repeatedDNASequences187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2018/1/10.
 */
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if(s.length()<10)return result;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-10;++i){
            String temp = s.substring(i,i+10);
            map.put(temp,map.getOrDefault(temp,0)+1);
            if(map.get(temp)==2)result.add(temp);
        }
        return result;
    }
}
