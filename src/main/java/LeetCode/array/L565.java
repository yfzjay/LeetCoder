package LeetCode.array;

public class L565 {
    public int arrayNesting(int[] nums) {
        int result=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            //nums[j]表示访问的位置，nums[j]!=-1表示该位置没有被访问过，就可以入数组
            //cnt+1 之后该位置标为-1表示已经访问过 随后循环再遇到-1的不用再判断
            //因为效果和之前相同
            for(int j=i;nums[j]!=-1;){
                cnt++;
                int t=nums[j];//拿到该位置，以便之后访问它
                nums[j]=-1;
                j=t;
            }
            result=Math.max(result,cnt);
        }
        return result;
    }
}
