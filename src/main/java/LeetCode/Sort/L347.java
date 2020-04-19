package LeetCode.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L347 {
    //用空间换时间 建立一些桶统计相同次数的数字 下标i的桶装的元素出现的次数是i
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencyNum=new HashMap<>();
        for(int num:nums){
            frequencyNum.put(num,frequencyNum.getOrDefault(num,0)+1);
        }
        List<Integer>[] lists=new ArrayList[nums.length+1];
        for(Integer key:frequencyNum.keySet()){
            int times=frequencyNum.get(key);
            if(lists[times]==null){
                lists[times]=new ArrayList<>();
            }
            lists[times].add(key);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=lists.length-1;i>=0;i--){
            if(lists[i]==null) continue;
            if(lists[i].size()<=(k-result.size())){
                result.addAll(lists[i]);
            }else{
                result.addAll(lists[i].subList(0,k-result.size()));
            }
            if(result.size()>=k){
                break;
            }
        }
        return result;
    }
}
