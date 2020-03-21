package LeetCode.hash;

import java.util.HashMap;

public class L594 {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int maxx=0;
        for(int key:hm.keySet()){
            if(hm.containsKey(key+1)){
                maxx=Math.max(maxx,hm.get(key)+hm.get(key+1));
            }
        }
        return maxx;
    }
}
