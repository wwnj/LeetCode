package kthSmallestElementInASortedMatrix378;

/**
 * Created by wb on 2017/11/23.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        Solution s = new Solution();
        System.out.println(s.kthSmallest(matrix,k));
    }
}
