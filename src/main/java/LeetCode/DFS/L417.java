package LeetCode.DFS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L417 {

    private int dir[][]={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private int m,n;
    private int[][] matrix;
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> result=new ArrayList<>();
        if(matrix==null||matrix.length==0) return result;
        this.matrix=matrix;
        m = matrix.length;
        n = matrix[0].length;
        boolean[][] canReachP = new boolean[m][n];
        boolean[][] canReachA = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(i, 0, canReachP);
            dfs(i, n - 1, canReachA);
        }
        for (int i = 0; i < n; i++) {
            dfs(0, i, canReachP);
            dfs(m - 1, i, canReachA);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canReachP[i][j] && canReachA[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }
    public void dfs(int i,int j,boolean grid[][]){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]){
            return;
        }
        grid[i][j]=true;
        for(int d=0;d<4;d++){
            int ni=i+dir[d][0];
            int nj=j+dir[d][1];
            if(ni>=0&&ni<m&&nj>=0&&nj<n&&matrix[i][j]<=matrix[ni][nj])
                dfs(ni,nj,grid);
        }
    }
}
