package LeetCode.array;

import java.util.HashMap;
import java.util.Map;

public class L697 {
    //数组的度 用3个数组桶解决
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> numsCnt=new HashMap<>();
        HashMap<Integer,Integer> numsLastIndex=new HashMap<>();
        HashMap<Integer,Integer> numsFirstIndex=new HashMap<>();
        int i=0;
        for(int num:nums){
            numsCnt.put(num,numsCnt.getOrDefault(num,0)+1);
            numsLastIndex.put(num,i);
            if(!numsFirstIndex.containsKey(num)){
                numsFirstIndex.put(num,i);
            }
            i++;
        }
        int maxCnt=Integer.MIN_VALUE;
        for(Map.Entry entry:numsCnt.entrySet()){
            maxCnt=Math.max((Integer) entry.getValue(),maxCnt);
        }
        int result=Integer.MAX_VALUE;
        for(int num:nums){
            if(numsCnt.get(num)!=maxCnt){
                continue;
            }
            result=Math.min(result,numsLastIndex.get(num)-numsFirstIndex.get(num));
        }
        return result+1;
    }
}
