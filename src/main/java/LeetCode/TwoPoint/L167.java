package LeetCode.TwoPoint;

public class L167 {
    //有序数组的twosum 用双指针解决 时间o(n) 空间o(1) 不允许是相同的两个元素 因此while(i<j)
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null||numbers.length==0) return null;
        int i=0,j=numbers.length-1;
        while(i<j){
            int num=numbers[i]+numbers[j];
            if(num==target) return new int[]{i+1,j+1};
            else if(num<target) i++;
            else j--;
        }
        return null;
    }
}
