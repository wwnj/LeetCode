package isomorphicStrings205;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2018/1/9.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Map<Character,List<Integer>> mapS = new HashMap<>();
        Map<Character,List<Integer>> mapT = new HashMap<>();
        for (int i=0;i<charArrayS.length;++i){
            if(!mapS.containsKey(charArrayS[i])) mapS.put(charArrayS[i],new ArrayList<>());
            mapS.get(charArrayS[i]).add(i);
        }
        for (int i=0;i<charArrayT.length;++i){
            if(!mapT.containsKey(charArrayT[i])) mapT.put(charArrayT[i],new ArrayList<>());
            mapT.get(charArrayT[i]).add(i);
        }
        for(List<Integer> listS:mapS.values()){
            if(listS.size()>1) {
                int count = 0;
                for (List<Integer> listT : mapT.values()) {
                    if (listS.containsAll(listT) && listT.containsAll(listS)) ++count;
                }
                if (count != 1) return false;
            }
        }
        for(List<Integer> listT:mapT.values()){
            if(listT.size()>1) {
                int count = 0;
                for (List<Integer> listS : mapS.values()) {
                    if (listS.containsAll(listT) && listT.containsAll(listS)) ++count;
                }
                if (count != 1) return false;
            }
        }
        return true;
    }
}
