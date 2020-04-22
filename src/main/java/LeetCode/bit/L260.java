package LeetCode.bit;

public class L260 {
    public int[] singleNumber(int[] nums) {
        int v=0;
        for(int num:nums){
            v^=num;
        }
        //v是其中两个不同的数异或得到的结果
        //v&(-v)是最小一位不为0的数 不为0的为即两个数不同的位
        // 因此可以用它来分开两个不同的数
        int diff=v&(-v);
        int[] result=new int[2];
        for(int num:nums){
            if((num&diff)==0){
                result[0]=result[0]^num;
            }else{
                result[1]=result[1]^num;
            }
        }
        return result;
    }
}
