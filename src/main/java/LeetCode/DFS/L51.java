package LeetCode.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L51 {
    //n皇后问题，这里只用三个标记数组即可 用空间换时间
    //45度线的坐标对应的标记数组下标是row+col
    //135度线的坐标对应的标记数组下标是n-1-(row-col)
    //剩下一个列数组下标就是col
    private char[][] nQueues;
    private boolean[] colUsed;
    private boolean[] col45Userd;
    private boolean[] col135Userd;
    private List<List<String>> result;
    private int n;
    public List<List<String>> solveNQueens(int n) {
        nQueues=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(nQueues[i],'.');
        }
        colUsed=new boolean[n];
        col45Userd=new boolean[2*n-1];
        col135Userd=new boolean[2*n-1];
        result=new ArrayList<>();
        this.n=n;
        dfs(0);
        return result;
    }
    public void dfs(int row){
        if(row==n){
            List<String> tmp=new ArrayList<>();
            for(char[] hang:nQueues){
                tmp.add(new String(hang));
            }
            result.add(tmp);
            return;
        }
        for(int col=0;col<n;col++){
            int used45=row+col;
            int used135=n-1-(row-col);
            if(colUsed[col]||col45Userd[used45]||col135Userd[used135]){
                continue;
            }
            colUsed[col]=col45Userd[used45]=col135Userd[used135]=true;
            nQueues[row][col]='Q';
            dfs(row+1);
            colUsed[col]=col45Userd[used45]=col135Userd[used135]=false;
            nQueues[row][col]='.';
        }
    }
}
