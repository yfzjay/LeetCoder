package LeetCode.bit;

public class L371 {
    //用异或方法求两数之和
    //a^b 得到不含进位部分 进位部分是(a&b)<<1
    public int getSum(int a, int b) {
        return b==0?(a^b):getSum((a^b),(a&b)<<1);
    }
}
