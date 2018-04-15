package arithmeticSlices413;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2017/12/10.
 */
public class Solution {
    private Map<Integer,Integer> map = new HashMap<>();

    public int numberOfArithmeticSlices(int[] A) {
        if(A.length<3)return 0;
        int start=0,end=2;
        while(end<A.length){
            if(isArithmetic(A,start,end)){
                ++end;
            }else{
                start = end-1;
                ++end;
            }
        }

        //Collection<Integer> valueCollection = map.values();
        List<Integer> list = new ArrayList<Integer>(map.values());
        //System.out.println(list);
        if(list.size()==0)return 0;
        int count = 0;
        list.sort(null);
        int size = list.size();
        int i=3,val=1;
        int index = 0;
        while(i<=list.get(size-1)){
            val = i==3?1:(val+i-2);
            while(list.get(index) == i){
                ++index;
                count+=val;
                if(index==size){
                    return count;
                }
            }
            ++i;
        }
        return count;
    }
    private boolean isArithmetic(int[] A,int start,int end){
        int diff = 0;
        for(int i=start;i<end;i++){
            if(i == start){
                diff = A[i+1] - A[i];
            }else{
                if(diff != A[i+1]-A[i]){
                    return false;
                }
            }
        }
        map.put(start,end-start+1);
        return true;
    }
}
