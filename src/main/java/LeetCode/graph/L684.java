package LeetCode.graph;

public class L684 {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        UF uf=new UF(n);
        for(int[] e:edges){
            int u=e[0],v=e[1];
            if(!uf.connect(u,v)){
                uf.union(u,v);
            }else{
                return e;
            }
        }
        return new int[]{-1,-1};
    }
    private class UF{
        private int[] fa;
        UF(int n){
            fa=new int[n+1];
            for(int i=0;i<n+1;i++){
                fa[i]=i;
            }
        }
        int find(int p){
            return fa[p];
        }
        boolean connect(int u,int v){
            return find(u)==find(v);
        }
        void union(int u,int v){
            u=find(u);
            v=find(v);
            if(u==v) return;
            for(int i=0;i<fa.length;i++){
                if(fa[i]==u){
                    fa[i]=v;
                }
            }
        }

    }
}
