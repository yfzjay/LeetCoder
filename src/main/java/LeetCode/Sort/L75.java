package LeetCode.Sort;

public class L75 {
    //荷兰国旗问题，用三个指针解决 p1,curr,p2
    //算法:
    //初始化0的最右边界：p0 = 0。在整个算法执行过程中 nums[idx < p0] = 0.
    //
    //初始化2的最左边界 ：p2 = n - 1。在整个算法执行过程中 nums[idx > p2] = 2.
    //
    //初始化当前考虑的元素序号 ：curr = 0.
    //
    //While curr <= p2 :
    //
    //若 nums[curr] = 0 ：交换第 curr个 和 第p0个 元素，并将指针都向右移。
    //
    //若 nums[curr] = 2 ：交换第 curr个和第 p2个元素，并将 p2指针左移 。
    //
    //若 nums[curr] = 1 ：将指针curr右移。
    public void sortColors(int[] nums) {
        int p1=0,p2=nums.length-1,curr=0;
        //=避免最后p2处是0的情况
        while(curr<=p2){
            if(nums[curr]==0){
                swap(nums,p1,curr);
                p1++;
                curr++;
            }else if(nums[curr]==2){
                swap(nums,p2,curr);
                p2--;
            }else{
                curr++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        nums[i]^=nums[j];
        nums[j]^=nums[i];
        nums[i]^=nums[j];
    }

    public static void main(String[] args) {
        new L75().sortColors(new int[]{2});
    }
}
