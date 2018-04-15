package heaters475;

/**
 * Created by wb on 2017/11/22.
 */
public class Main {
    public static void main(String[] args) {
        int[] houses = {1,2,3,4};
        int[] heaters = {1,4};
        Solution s = new Solution();
        System.out.println(s.findRadius(houses,heaters));
    }
}
