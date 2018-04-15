package kthSmallestElementInASortedMatrix378;

import java.util.Arrays;

/**
 * Created by wb on 2017/11/23.
 */
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] temp = new int[matrix.length*matrix[0].length];
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                temp[j+i*matrix[0].length]=matrix[i][j];
        Arrays.sort(temp);
        return temp[k-1];
    }
}