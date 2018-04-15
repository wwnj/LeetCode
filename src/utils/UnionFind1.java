package utils;

/**
 * Created by wb on 2018/1/27.
 */
public class UnionFind1 {
    //连通分量数
    private int count;
    //每个数所连通的分量
    private int id[];

    //初始化时N个点有N个分量
    public UnionFind1(int N){
        count = N;
        id = new int[N];
        for(int i=0;i<N;++i){
            id[i] = i;
        }
    }

    //返回连通分量数
    public int getCount(){
        return count;
    }

    //查找x所属的连通分量
    public int find(int x){
        return id[x];
    }

    //连接p,q(将p的分量改为q所在的分量)
    public void union(int p,int q){
        int pID = find(p);
        int qID = find(q);
        if(pID == qID)return;
        for(int i=0;i<id.length;++i){
            if(find(i) == pID)
                id[i] = qID;
        }
        //记得每进行一次连接，分量数减一
        --count;
    }

    //判断p,q是否连接，即是否属于同一分量
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
}
