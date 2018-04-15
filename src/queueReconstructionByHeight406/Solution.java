package queueReconstructionByHeight406;

import java.util.*;

/**
 * Created by wb on 2018/1/10.
 */
public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int[][] result = new int[people.length][people[0].length];
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<people.length;++i){
            if(!map.containsKey(people[i][1]))map.put(people[i][1],new ArrayList<>());
            map.get(people[i][1]).add(people[i][0]);
        }
        for(int i:map.keySet()){
            List<Integer> list = map.get(i);
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });
        }
        Integer[] indexArray = map.keySet().toArray(new Integer[]{});
        List<Integer[][]> resultList = new ArrayList<>();
        for(Integer i:indexArray){
            for(int val:map.get(i)){

            }
        }
        return  result;
    }
}
