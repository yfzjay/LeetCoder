package LeetCode.DFS;

public class L547 {
    public int findCircleNum(int[][] M) {
        int n=M.length;
        if(n==0) return 0;
        int visited[]=new int[n];
        int num=0;
        for(int i=0;i<n;i++){
            //当visit=0说明i没有被追踪过，之前的朋友圈也没有包括i，因此对它追，并num+1
            if(visited[i]==0){
                num++;
                dfs(M,i,visited);
            }
        }
        return num;
    }
    public void dfs(int[][] m,int k,int visit[]){
        visit[k]=1;
        //追的时候关注本行的元素 如果等于1 且没被追过 就可以继续追
        for(int j=0;j<m[0].length;j++){
            if(j!=k&&m[k][j]==1&&visit[j]==0){
                dfs(m,j,visit);
            }
        }
    }
}
