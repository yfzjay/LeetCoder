package LeetCode.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L40 {
/*
* 全排列中，
* 1、为了避免重复数字带来的干扰，如[1,1,2],[1，1，2]，可以用排序后剪枝操作
* 2、为了让数字相同的排列只出现一次，如[1,2,3],[2,1,3]不会同时出现，用start（start+1）为起始做剪枝操作
* 3、如果两者都要满足，如此题，要再有重复数字的情况下，不出现重复组合，以上两个方法都要用上
* */
    List<List<Integer>> res=new ArrayList<>();
    boolean[] flag=null;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates==null||candidates.length==0) return res;
        Arrays.sort(candidates);
        flag=new boolean[candidates.length+1];
        dfs(target,candidates,new ArrayList<Integer>(),0);
        return res;
    }
    public void dfs(int target,int[] nums,ArrayList<Integer> values,int start){
        if(target<=0){
            if(target==0){
                res.add(new ArrayList<>(values));
            }
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(flag[i]) continue;
            if(i!=0&&nums[i]==nums[i-1]&&!flag[i-1]) continue;
            int num=nums[i];
            flag[i]=true;
            target-=num;
            values.add(num);
            dfs(target,nums,values,i+1);
            values.remove(values.size()-1);
            target+=num;
            flag[i]=false;
        }
    }
}
