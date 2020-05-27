package LeetCode.binary_search;

public class L153 {
/*
* 类似经典问题 在0001111中找第一个1
* */
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]<nums[h]){
                h=m;
            }else{
                l=m+1;
            }
        }
        return nums[l];
    }
}
