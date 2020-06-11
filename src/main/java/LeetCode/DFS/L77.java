package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

public class L77 {

    public List<List<Integer>> res;
    public boolean[] flag;
    public List<List<Integer>> combine(int n, int k) {
        res=new ArrayList<>();
        if(n==0||k==0) return res;
        flag=new boolean[n];
        dfs(n,k,new ArrayList<Integer>());
        return res;
    }
    public void dfs(int n, int k, ArrayList<Integer> values){
        if(values.size()==k){
            res.add(new ArrayList<>(values));
            return;
        }
        for(int i=1;i<=n;i++){
            if(flag[i]) continue;
            if(values.size()!=0&&i<values.get(i-1)) continue;
            flag[i]=true;
            values.add(i);
            dfs(n,k,values);
            flag[i]=false;
            values.remove(values.size()-1);
        }
    }
}
