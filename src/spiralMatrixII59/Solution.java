package spiralMatrixII59;

/**
 * Created by wb on 2018/2/28.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int num=0,rowBegin=0,rowEnd=n-1,colBegin=0,colEnd=n-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;++i){
                nums[rowBegin][i]=++num;
            }
            ++rowBegin;
            for(int i=rowBegin;i<=rowEnd;++i){
                nums[i][colEnd]=++num;
            }
            --colEnd;
            for(int i=colEnd;i>=colBegin;--i){
                nums[rowEnd][i]=++num;
            }
            --rowEnd;
            for(int i=rowEnd;i>=rowBegin;--i){
                nums[i][colBegin]=++num;
            }
            ++colBegin;
        }
        return nums;
    }
}
