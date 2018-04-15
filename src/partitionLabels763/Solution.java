package partitionLabels763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2018/3/8.
 */
public class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        Map<Character,List<Integer>> map = new HashMap<>();
        for(int i=0;i<S.length();++i) {
            List<Integer> list = map.getOrDefault(S.charAt(i), new ArrayList<>());
            list.add(i);
            map.put(S.charAt(i), list);
        }
        dealWith(result,S,map,0,map.get(S.charAt(0)).get(map.get(S.charAt(0)).size()-1));
        return result;
    }
    private void dealWith(List<Integer> result,String S,Map<Character,List<Integer>> map,int begin,int end){
        int temp = begin;
        while(++temp<=end){
            end = end>=(map.get(S.charAt(temp)).get(map.get(S.charAt(temp)).size()-1))?end:(map.get(S.charAt(temp)).get(map.get(S.charAt(temp)).size()-1));
        }
        result.add(end-begin+1);
        if(end<S.length()-1)
            dealWith(result,S,map,end+1,map.get(S.charAt(end+1)).get(map.get(S.charAt(end+1)).size()-1));
    }
}
