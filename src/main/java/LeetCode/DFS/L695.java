package LeetCode.DFS;

public class L695 {

    private int dir[][]={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int result=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0)
                result=Math.max(dfs(grid,m,n,i,j),result);
            }
        }
        return result;
    }
    public int dfs(int[][] grid,int m,int n,int i,int j){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0){
            return 0;
        }
        int area=1;
        grid[i][j]=0;
        for(int d=0;d<4;d++){
            area+=dfs(grid,m,n,i+dir[d][0],j+dir[d][1]);
        }
        return area;
    }
}
