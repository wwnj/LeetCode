package groupAnagrams49;

import java.util.*;

/**
 * Created by wb on 2018/1/8.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            List<String> list = map.getOrDefault(new String(charArray),new ArrayList<>());
            list.add(str);
            map.put(new String(charArray),list);
        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(map.values());
        return result;
    }
}
