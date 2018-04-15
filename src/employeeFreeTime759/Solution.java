package employeeFreeTime759;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/1/14.
 */
public class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> reserve = new ArrayList<>();
        for(List<Interval> list:schedule)
            for(Interval interval:list){
                if(reserve.size()==0){
                    reserve.add(interval);
                }else{
                    boolean flag = true;
                    for(Interval resInterval:reserve){
                        if(resInterval.end>=interval.start){
                            if(resInterval.start<=interval.start){
                                if(resInterval.end>=interval.end){
                                    flag =false;
                                    break;
                                }else{
                                    flag=false;
                                    reserve.remove(resInterval);
                                    reserve.add(new Interval(resInterval.start,interval.end));
                                    break;
                                }
                            }else{

                            }
                        }
                    }
                    if(flag)reserve.add(interval);
                }
            }
        return null;
    }
}
