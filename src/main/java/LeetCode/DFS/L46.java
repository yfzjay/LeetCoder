package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

public class L46 {

    List<List<Integer>> res=new ArrayList<>();
    boolean[] flag;
    public List<List<Integer>> permute(int[] nums) {
        if(nums==null||nums.length==0) return res;
        flag=new boolean[nums.length+1];
        dfs(nums,new ArrayList<Integer>());
        return res;
    }
    public void dfs(int[] nums,ArrayList<Integer> values){
        if(values.size()==nums.length){
            res.add(new ArrayList<>(values));
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i]) continue;
            flag[i]=true;
            values.add(nums[i]);
            dfs(nums,values);
            flag[i]=false;
            values.remove(values.size()-1);
        }
    }
}
