package LeetCode.bit;

public class L190 {
    // x<<n算术左移 相当于乘2^n x>>n算术右移 相当于除以2^n 如果是负数，左边补1
    // x>>>n 无符号右移 左边补0 x<<<n无符号右移和算术右移相同
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            result=result<<1;
            result|=(1&n);
            n>>>=1;
        }
        return result;
    }
}
