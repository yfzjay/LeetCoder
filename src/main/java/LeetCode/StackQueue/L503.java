package LeetCode.StackQueue;

import java.util.Stack;

public class L503 {
    //和739不同的是用了循环数组 因此要遍历两遍 而且只在第一遍时加入未解决的下标进入栈
    public int[] nextGreaterElements(int[] nums) {
        int len=nums.length;
        int[] nextm=new int[len];
        for(int i=0;i<len;i++){
            nextm[i]=-1;
        }
        Stack<Integer> indexs=new Stack<>();
        for(int i=0;i<len*2;i++){
            int k=i%len;
            while(!indexs.isEmpty()&&nums[k]>nums[indexs.peek()]){
                int in=indexs.pop();
                nextm[in]=nums[k];
            }
            if(i<len) indexs.add(i);
        }
        return nextm;
    }
}
