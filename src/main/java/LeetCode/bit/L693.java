package LeetCode.bit;

public class L693 {
    //判断一个数二进制位是不是交替出现 101010这样
    //因此n>>>1和n一定每一位都不同 而不是这样的数一定会有相同的位
    //每一位都不同，异或后得到全为1的数 再用n&(n+1)==0 来判断全为1的数
    public boolean hasAlternatingBits(int n) {
        int v=n^(n>>>1);
        return (v&(v+1))==0;
    }
}
