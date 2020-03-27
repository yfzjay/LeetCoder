package LeetCode.array;

public class L287 {
    //快慢指针 找入环点法
    public int findDuplicate(int[] nums) {
        int fast=0,slow=0;
        while(true){
            fast=nums[nums[fast]];
            slow=nums[slow];
            if(fast==slow){
                fast=0;
                while(fast!=slow){
                    fast=nums[fast];
                    slow=nums[slow];
                }
                return slow;
            }
        }
    }
}
