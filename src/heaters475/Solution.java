package heaters475;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wb on 2017/11/22.
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < houses.length; i++) {
            for (int j = 0; j < heaters.length; j++) {
                if(houses[i]<heaters[j]){
                    if (j>0){
                        int min = (heaters[j]-houses[i])<=(houses[i]-heaters[j-1])
                                ?(heaters[j]-houses[i]):(houses[i]-heaters[j-1]);
                        list.add(min);
                        break;
                    }
                    list.add(heaters[j]-houses[i]);
                    break;
                }
                if (j == heaters.length - 1) {
                    list.add(houses[i] - heaters[j]);
                    break;
                }
            }
        }
        int res = list.get(0);
        for(int i:list){
            res = res>=i?res:i;
        }
        return res;
    }
}
