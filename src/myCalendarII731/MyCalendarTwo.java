package myCalendarII731;

import java.util.ArrayList;

/**
 * Created by wb on 2018/2/26.
 */
public class MyCalendarTwo {

    ArrayList<Integer> interval;

    ArrayList<Integer> alreadyTwo;

    public MyCalendarTwo() {
        interval = new ArrayList<>();
        alreadyTwo = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(int i=0;i<alreadyTwo.size();++i,++i){
            int low=alreadyTwo.get(i),high=alreadyTwo.get(i+1);
            if((start<=low && end>low) || (start<high && end>high))
                return false;
            if((low<=start && high>start) || (low<end && high>end))
                return false;
        }
        for(int i=0;i<interval.size();++i,++i){
            int low=interval.get(i),high=interval.get(i+1);
            if(low<=start && high>start){
                if(high>end){
                    alreadyTwo.add(start);
                    alreadyTwo.add(end);
                }else{
                    alreadyTwo.add(start);
                    alreadyTwo.add(high);
                }
            }else if(start<=low && end>low){
                if(high<end){
                    alreadyTwo.add(low);
                    alreadyTwo.add(high);
                }else{
                    alreadyTwo.add(low);
                    alreadyTwo.add(end);
                }
            }
        }
        interval.add(start);
        interval.add(end);
        return true;
    }
}
