package sortCharactersByFrequency451;

import java.util.*;

/**
 * Created by wb on 2017/12/22.
 */
public class Solution {
    public String frequencySort(String s) {
        char[] cArray = s.toCharArray();
        Map<Character,StringBuilder> map = new HashMap<>();
        for(char c:cArray)
            map.put(c,map.getOrDefault(c,new StringBuilder()).append(c));
        StringBuilder[] resArray = map.values().toArray(new StringBuilder[0]);
        Arrays.sort(resArray, new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder o1, StringBuilder o2) {
                return o2.length()-o1.length();
            }
        });
        StringBuilder res = new StringBuilder();
        for(StringBuilder str:resArray)
            res.append(str);
        return String.valueOf(res);
    }
}
