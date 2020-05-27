package LeetCode.BFS;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class L1091 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid==null||grid.length==0||grid[0]==null||grid[0].length==0){
            return 0;
        }
        Queue<Pair<Integer,Integer>> queue=new LinkedList<>();
            int [][]dir={{-1,0},{1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        int m=grid.length;
        int n=grid[0].length;
        queue.add(new Pair<>(0,0));
        int path=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            path++;
            while(size-->0){
                Pair<Integer,Integer> pair=queue.poll();
                int k1=pair.getKey(),k2=pair.getValue();
                if(grid[k1][k2]==1) continue;
                if(k1==m-1&&k2==n-1){
                    return path;
                }
                grid[k1][k2]=1;
                for(int i=0;i<8;i++){
                   int nk1=k1+dir[i][0];
                   int nk2=k2+dir[i][1];
                   if(nk1<0||nk2<0||nk1>=m||nk2>=n){
                       continue;
                   }
                   queue.add(new Pair<>(nk1,nk2));
                }
            }
        }
        return path;
    }
}
