package LeetCode.bit;

public class L461 {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int cnt=0;
        while(z!=0){
            //每次把最小一位1置0
            z=z&(z-1);
            cnt++;
        }
        return cnt;
    }
}
