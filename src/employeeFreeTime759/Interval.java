package employeeFreeTime759;

/**
 * Created by wb on 2018/1/14.
 */
public class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }

    @Override
    public String toString() {
        return "["+start+","+end+"]";
    }
}
