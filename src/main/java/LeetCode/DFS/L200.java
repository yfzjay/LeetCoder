package LeetCode.DFS;

public class L200 {

    private int [][]dir={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int numIslands(char[][] grid) {

        int m=grid.length;
        if(m==0) return 0;
        int n=grid[0].length;
        int result=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!='0'){
                    result++;
                    dfs(grid,m,n,i,j);
                }
            }
        }
        return result;
    }
    public void dfs(char[][] grid,int m,int n,int i,int j){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='1';
        for(int d=0;d<4;d++){
            dfs(grid,m,n,i+dir[d][0],j+dir[d][1]);
        }
    }
}
