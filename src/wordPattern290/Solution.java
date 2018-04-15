package wordPattern290;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2018/1/10.
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,List<Integer>> map = new HashMap<>();
        char[] cArray = pattern.toCharArray();
        for(int i=0;i<cArray.length;++i){
            if(!map.containsKey(cArray[i]))map.put(cArray[i],new ArrayList<>());
            map.get(cArray[i]).add(i);
        }

        String[] strings = str.split(" ");
        if(pattern.length()!=strings.length)return false;
        Map<String,List<Integer>> map2 = new HashMap<>();
        for(int i=0;i<strings.length;++i){
            if(!map2.containsKey(strings[i]))map2.put(strings[i],new ArrayList<>());
            map2.get(strings[i]).add(i);
        }
        if(map.size()!=map2.size())return false;
        for(char c:map.keySet()){
            List<Integer> list = map.get(c);
            for(int i=1;i<list.size();++i)
                if(strings[list.get(0)].compareTo(strings[list.get(i)]) != 0)
                    return false;
        }
        return true;
    }
}
