package sumII454;

import java.util.Arrays;

/**
 * Created by wb on 2017/11/22.
 */
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int[] E = new int[A.length * A.length];
        int[] F = new int[A.length * A.length];
        for (int i=0,k=0;i<A.length;i++) {
            for (int j : B) {
                E[k++] = A[i] + j;
            }
        }
        for (int i=0,k=0;i<C.length;i++) {
            for (int j : D) {
                F[k++] = C[i] + j;
            }
        }
        Arrays.sort(E);
        Arrays.sort(F);
//        for (int i :
//                E) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int i :
//                F) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        int res = 0;
        for (int i = 0; i < E.length; i++) {
            for (int j = 0; j < F.length; j++) {
                if (E[i] + F[j] == 0) {
                    int temp1 = E[i];
                    int temp2 = F[j];
                    int count1 = 1;
                    int count2 = 1;
                    i++;
                    while (i < E.length && E[i] == temp1) {
                        count1++;
                        i++;
                    }
                    i--;
                    j++;
                    while (j < F.length && F[j] == temp2) {
                        count2++;
                        j++;
                    }
                    j--;
                    res += count1 * count2;
                    break;
                }
            }
        }
        return res;
    }
}