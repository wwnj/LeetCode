package employeeFreeTime759;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/1/14.
 */
public class Main {
    public static void main(String[] args){
        List<List<Interval>> schedule = new ArrayList<>();
        List<Interval> temp = new ArrayList<>();
        temp.add(new Interval(1,3));
        temp.add(new Interval(6,7));
        schedule.add(temp);
        List<Interval> temp1 = new ArrayList<>();
        temp1.add(new Interval(2,4));
        schedule.add(temp1);
        List<Interval> temp2 = new ArrayList<>();
        temp2.add(new Interval(2,5));
        schedule.add(temp2);
        List<Interval> temp3 = new ArrayList<>();
        temp3.add(new Interval(9,12));
        schedule.add(temp3);
        System.out.println(schedule);
        Solution solution = new Solution();
        System.out.println(solution.employeeFreeTime(schedule));
    }
}
