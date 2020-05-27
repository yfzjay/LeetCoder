package LeetCode.greedy;

public class L665 {
    /*
    *给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。

我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，总满足 array[i] <= array[i + 1]。
     尽可能使不符合的数变小 这样尽可能不影响后面的数 当num[i]<num[i-1],需要先让前面的符合，如果num[i]<num[i-2],
     * 让num[i]=num[i-1] 否则让num[i-1]=num[i]，即尽量不影响后面的数 按照这个思路 还可以计算出最少改变多少个元素
     * 让数组满足非递减数列
    * */
    public boolean checkPossibility(int[] nums) {
        if(nums==null||nums.length==0) return true;
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                if(i-2>=0&&nums[i]<nums[i-2]){
                    nums[i]=nums[i-1];
                }else{
                    nums[i-1]=nums[i];
                }
                if(cnt==1){
                    return false;
                }else{
                    cnt++;
                }
            }
        }
        return true;
    }
}
