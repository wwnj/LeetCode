package maximumLengthOfRepeatedSubarray718;

/**
 * Created by wb on 2018/1/8.
 */
public class Solution {
    public int findLength(int[] A, int[] B) {
        int max=0;
        for(int i=0;i<A.length-1;++i){
            int len = 0;
            for(int j=0;j<B.length;++j){
                if(A[i]==B[j]){
                    ++len;
                }
            }
        }
        return 0;
    }
}
