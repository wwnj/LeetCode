package utils;

/**
 * Created by wb on 2018/1/27.
 */
public class UnionFind3 {
    //连通分量数
    private int count;
    //每个树所连通的分量
    private int[] id;
    //权重：树的大小
    private int[] sz;

    //初始化时N个点有N颗树
    public UnionFind3(int N){
        count = N;
        id = new int[N];
        sz = new int[N];
        for(int i=0;i<N;++i){
            id[i] = i;
            sz[i] = 1;
        }
    }

    //返回分量数
    public int getCount(){
        return count;
    }

    //查找树的根节点
    public int root(int p){
        /*while(p!=id[p]){
            //将p节点的父节点设置为它的爷爷节点
            id[p] = id[id[p]];
            p=id[p];
        }
        return p;*/
        if (id[p] == p) return p;//只有指向根节点才返回
        return id[p] = root(id[p]);
    }

    //判断两个树是否属于同一颗树
    public boolean connected(int p,int q){
        return root(p) == root(q);
    }

    //连通两个树(将q的分量改为p所在的分量)
    public void union(int p,int q){
        int pID = root(p);
        int qID = root(q);
        if(pID == qID)return;
        if(sz[pID]<qID) {
            id[pID] = qID;
            sz[qID] += sz[pID];
        }
        else {
            id[qID] = pID;
            sz[pID] += sz[qID];
        }
        --count;
    }
}
