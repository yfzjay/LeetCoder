package LeetCode.bit;

public class L476 {

    public int findComplement(int num) {
        //求补码 101 -> 010
        //101^111=010
        //h得到最大位1
        int h=Integer.highestOneBit(num);
        h=(h<<1)-1;
        return num^h;
    }
}
