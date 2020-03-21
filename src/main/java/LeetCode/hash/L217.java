package LeetCode.hash;

import java.util.HashSet;

public class L217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        return nums.length!=hs.size();
    }

    public static void main(String[] args) {

    }

}
