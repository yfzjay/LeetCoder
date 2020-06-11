package LeetCode.DFS;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

public class L39 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null||candidates.length==0) return res;
        dfs(target,candidates,new ArrayList<Integer>(),0);
        //start为了防止多个重复组合的发生 例如【2,2,3】,[3,2,2]；【1，2，3】，【2，3，1】，因为他们的和是一样的
        //每次以start开始，就不会寻找之前的元素，因此每种排列之和只可能出现一次，并且也不会漏掉某一组合
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
            int num=nums[i];
            target-=num;
            values.add(num);
            dfs(target,nums,values,i);
            values.remove(values.size()-1);
            target+=num;
        }
    }
}
