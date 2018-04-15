package friendCircles547;

import utils.UnionFind3;

/**
 * Created by wb on 2018/1/27.
 */
public class Solution {
    public int findCircleNum(int[][] M) {
        UnionFind3 uf = new UnionFind3(M.length);
        for(int i=0;i<M.length;++i)
            for(int j=i+1;j<M[0].length;++j){
                if(M[i][j]==1)
                    if(!uf.connected(i,j))
                        uf.union(i,j);
            }
        return uf.getCount();
    }
}
