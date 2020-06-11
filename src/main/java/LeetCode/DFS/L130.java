package LeetCode.DFS;

import java.util.HashMap;

public class L130 {
    /*
    * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
示例:
X X X X
X O O X
X X O X
X O X X
运行你的函数后，矩阵变为：
X X X X
X X X X
X X X X
X O X X
解释:
被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。
* 任何不在边界上且不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。
* 如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
*/
    private int dir[][]={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public void solve(char[][] board) {
        if(board==null||board.length==0) return;
        int m=board.length;
        int n=board[0].length;
        //先把四周O并与之相连的部分都标记为T 最后把T变成O 把剩下的O变成X
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,m,n);
            }
            if(board[i][n-1]=='O'){
                dfs(board,i,n-1,m,n);
            }
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j,m,n);
            }
            if(board[m-1][j]=='O'){
                dfs(board,m-1,j,m,n);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char[][] grid,int i,int j,int m,int n){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]!='O'){
            return;
        }
        grid[i][j]='T';
        for(int d=0;d<4;d++){
            dfs(grid,i+dir[d][0],j+dir[d][1],m,n);
        }
    }

    public static void main(String[] args) {
        HashMap<String,Node> hashMap=new HashMap();
        hashMap.put("abc",new Node(3));
    }
}
