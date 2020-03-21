package LeetCode.hash;

import java.util.HashMap;

public class L1 {
//利用hashmap，用空间换时间 空间复杂度 时间复杂度  均为 o(n)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int yu=target-nums[i];
            if(hm.containsKey(yu)){
                return new int[]{hm.get(yu),i};
            }else{
                hm.put(nums[i],i);
            }
        }
        return null;
    }
}
