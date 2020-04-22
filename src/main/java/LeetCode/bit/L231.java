package LeetCode.bit;

public class L231 {
    //n&(-n)得到最小一位1 n&(n-1)得到减去最小一位1后的值
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
