package LeetCode.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L47 {
    List<List<Integer>> res=new ArrayList<>();
    boolean[] flag;
    public List<List<Integer>> permuteUnique(int[] nums) {
        /*
        * 带重复元素的全排列，先排序，然后如果当前元素和数组上一个元素相同，且上一个元素没用过，就跳过
        * 这样就只会存在一种排列方式，就是按照数组排过序的一种，重复的元素排列方式不会出现第二种
        * */
        if(nums==null||nums.length==0) return res;
        flag=new boolean[nums.length+1];
        Arrays.sort(nums);
        dfs(nums,new ArrayList<Integer>());
        return res;
    }
    public void dfs(int[] nums,ArrayList<Integer> values){
        if(values.size()==nums.length){
            res.add(new ArrayList<>(values));
        }
        for(int i=0;i<nums.length;i++){
            if(flag[i]) continue;
            if(i!=0&&nums[i]==nums[i-1]&&!flag[i-1]) continue;
            flag[i]=true;
            values.add(nums[i]);
            dfs(nums,values);
            flag[i]=false;
            values.remove(values.size()-1);
        }
    }
}
