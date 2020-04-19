package LeetCode.bit;

public class L136 {

    public int singleNumber(int[] nums) {
        //0^x=x x^x=0
        int z=0;
        for(int num:nums){
            z=z^num;
        }
        return z;
    }
}
