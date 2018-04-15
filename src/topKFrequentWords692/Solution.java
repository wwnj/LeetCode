package topKFrequentWords692;

import java.util.*;

/**
 * Created by wb on 2018/1/5.
 */
public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(String s:words)
            map.put(s,map.getOrDefault(s,0)+1);
        Integer[] valArray = map.values().toArray(new Integer[0]);
        Arrays.sort(valArray);
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        set.addAll(Arrays.asList(valArray).subList(valArray.length - k, valArray.length));
        Map<Integer,List<String>> map2 = new HashMap<>();
        for(int i:set){
            List<String> tempList = new ArrayList<>();
            for(String s:map.keySet()){
                if(map.get(s)==i){
                    tempList.add(s);
                }
            }
            tempList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            if(k>=tempList.size()){
                result.addAll(tempList);
            }else{
                for(int j=0;j<k;++j)
                    result.add(tempList.get(j));
                break;
            }
            k -= tempList.size();
        }
        return result;
    }
}
