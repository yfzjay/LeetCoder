package LeetCode.array;

public class L485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int tmp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                tmp+=1;
                max=Math.max(tmp,max);
            }else{
                tmp=0;
            }
        }
        return max;
    }
}
