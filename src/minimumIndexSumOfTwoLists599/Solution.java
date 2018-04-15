package minimumIndexSumOfTwoLists599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2017/12/26.
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,List<Integer>> map = new HashMap<>();
        for(int i=0;i<list1.length;++i){
            List<Integer> list = map.getOrDefault(list1[i],new ArrayList<Integer>());
            list.add(i);
            map.put(list1[i],list);
        }
        for(int i=0;i<list2.length;++i){
            List<Integer> list = map.getOrDefault(list2[i],new ArrayList<Integer>());
            list.add(i);
            map.put(list2[i],list);
        }
        int min=Integer.MAX_VALUE;
        List<String> resList = new ArrayList<>();
        for(String s:map.keySet()){
            List<Integer> list = map.get(s);
            if(list.size()==2){
                if(min>list.get(0)+list.get(1)){
                    min = list.get(0)+list.get(1);
                    resList.clear();
                    resList.add(s);
                }else if(min==list.get(0)+list.get(1)){
                    min = list.get(0)+list.get(1);
                    resList.add(s);
                }
            }
        }
        String[] res = new String[resList.size()];
        for(int i=0;i<resList.size();++i)
            res[i]=resList.get(i);
        return res;
    }
}
