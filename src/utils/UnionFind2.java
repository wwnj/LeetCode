package utils;

/**
 * Created by wb on 2018/1/27.
 */
public class UnionFind2 {
    //连通分量数
    private int count;
    //每个树所连通的分量
    private int[] id;

    //初始化时N个点有N颗树
    public UnionFind2(int N){
        count = N;
        id = new int[N];
        for(int i=0;i<N;++i){
            id[i] = i;
        }
    }

    //返回分量数
    public int getCount(){
        return count;
    }

    //查找树的根节点
    public int find(int x){
        while(x!=id[x])x=id[x];
        return x;
    }

    //判断两个树是否属于同一颗树
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    //连通两个树(将q的分量改为p所在的分量)
    public void union(int p,int q){
        int pID = find(p);
        int qID = find(q);
        if(pID == qID)return;
        id[qID] = pID;
        --count;
    }
}
