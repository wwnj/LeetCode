package sumII454;

import java.util.Arrays;

/**
 * Created by wb on 2017/11/22.
 */
public class Solution2 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int[] E = new int[A.length * A.length];
        int[] F = new int[A.length * A.length];
        for (int i = 0, k = 0; i < A.length; i++) {
            for (int j : B) {
                E[k++] = A[i] + j;
            }
        }
        for (int i = 0, k = 0; i < C.length; i++) {
            for (int j : D) {
                F[k++] = C[i] + j;
            }
        }
        Arrays.sort(F);
        int res = 0;
        for (int i : E) {
            int goal = -i;
            int low = 0;
            int high = F.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (F[mid] == goal) {
                    res++;
                    int k = mid;
                    k--;
                    while(k>=0&&F[k]==F[mid]){
                        res++;
                        k--;
                    }
                    int m = mid;
                    m++;
                    while(m<=F.length-1&&F[m]==F[mid]){
                        res++;
                        m++;
                    }
                    break;
                }
                if (F[mid] > goal) {
                    high = mid - 1;
                }
                if (F[mid] < goal) {
                    low = mid + 1;
                }
            }
        }
        return res;
    }
}
