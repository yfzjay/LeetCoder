package LeetCode.binary_search;

public class L34 {
    /*
    * 题目描述：给定一个有序数组 nums 和一个目标 target，要求找到 target 在 nums 中的第一个位置和最后一个位置。
      可以用二分查找找出第一个位置和最后一个位置，但是寻找的方法有所不同，需要实现两个二分查找。
      我们将寻找 target 最后一个位置，转换成寻找 target+1 第一个位置，再往前移动一个位置。
      这样我们只需要实现一个二分查找代码即可。
      *
      * 二分查找：定h=m还是h=m-1，由此定while()循环条件是while(l<h)还是while(l<=h)
      * 定返回的是l还是h
      * 定h初始是length还是length-1
    * */
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findFirst(nums,target+1)-1;
        if(first==nums.length||nums[first]!=target){
            return new int[]{-1,-1};
        }else{
            return new int[]{first,last};
        }
    }
    public int findFirst(int[] nums,int target){
        int l=0,h=nums.length;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]<target){
                l=m+1;
            }else{
                h=m;
            }
        }
        return l;
    }
}
