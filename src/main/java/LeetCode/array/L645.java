package LeetCode.array;

import java.util.Arrays;
import java.util.Collections;

public class L645 {
    //对于数组出现奇怪情况的题目，数组桶是一个不错的选择
    public int[] findErrorNums(int[] nums) {
        int []res=new int[2];
        int []temp=new int[nums.length+1];
        for(int num:nums){
            temp[num]++;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==1) continue;
            if(temp[i]==2) res[0]=i;
            else{
                res[1]=i;
                break;
            }
        }
        return res;
    }
}
