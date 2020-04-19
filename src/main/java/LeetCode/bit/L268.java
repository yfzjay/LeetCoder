package LeetCode.bit;

public class L268 {
    //下标和下标对应的元素是相同的 全部做异或后 最后会剩下一个没有和相应元素对应的下标
    public int missingNumber(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++){
            z=z^i^nums[i];
        }
        z=z^nums.length;
        return z;
    }
}
