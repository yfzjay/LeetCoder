package LeetCode.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L279 {

    public int numSquares(int n) {
        List<Integer> squares=getSquares(n);
        Queue<Integer> queue=new LinkedList<>();
        boolean []mark=new boolean[n+1];
        mark[n]=true;
        queue.add(n);
        int path=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            path++;
            while(size-->0){
                int cur=queue.poll();
                for(int squ:squares){
                    int next=cur-squ;
                    if(next<0) break;
                    if(next==0) return path;
                    if(mark[next]) continue;
                    mark[next]=true;
                    queue.add(next);
                }
            }
        }
        return n;
    }
    private List<Integer> getSquares(int n){
        List<Integer> result=new ArrayList<>();
        int num=1,diff=3;
        while(num<=n){
            result.add(num);
            num+=diff;
            diff+=2;
        }
        return result;
    }

}
