package LeetCode.hash;
import java.util.HashMap;
import java.util.Map;

public class L128 {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,1);
        }
        for(int num:nums){
            forward(hm,num);
        }
        int maxx=0;
        //找到每个key值对应的最长序列中的最大值
        for(Map.Entry entry:hm.entrySet()){
            maxx=Math.max(maxx, (Integer) entry.getValue());
        }
        return maxx;
    }
    //计算从当前值为起始，比当前值大的最长序列
    public int forward(Map<Integer,Integer> hm,int num){
        if(!hm.containsKey(num)){//如果没有，就返回0
            return 0;
        }
        if(hm.get(num)>1){//如果大于一，说明该位置已经计算出，直接返回
            return hm.get(num);
        }
        int sum=forward(hm,num+1)+1;
        hm.put(num,sum);
        return sum;
    }

}
