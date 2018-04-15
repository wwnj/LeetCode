package myCalendarII731;

/**
 * Created by wb on 2018/2/26.
 */
public class Main {
    public static void main(String[] args){
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        System.out.println(myCalendarTwo.book(10,20));
        System.out.println(myCalendarTwo.alreadyTwo);
        System.out.println(myCalendarTwo.book(50,60));
        System.out.println(myCalendarTwo.alreadyTwo);
        System.out.println(myCalendarTwo.book(10,40));
        System.out.println(myCalendarTwo.alreadyTwo);
        System.out.println(myCalendarTwo.book(5,15));
        System.out.println(myCalendarTwo.alreadyTwo);
        System.out.println(myCalendarTwo.book(5,10));
        System.out.println(myCalendarTwo.alreadyTwo);
        System.out.println(myCalendarTwo.book(25,55));
    }
}
