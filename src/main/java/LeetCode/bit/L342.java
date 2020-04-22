package LeetCode.bit;

public class L342 {
    public boolean isPowerOfFour(int num) {
        return num>0&&(num&(num-1))==0&&(num&0b01010101010101010101010101010101)==1;
    }

    public static void main(String[] args) {
        System.out.println(0b0101);
    }
}
