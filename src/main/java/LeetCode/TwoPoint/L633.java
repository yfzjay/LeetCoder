package LeetCode.TwoPoint;

public class L633 {
    //判断一个数是否是两个数平方和：用双指针解决，右边指针从sqrt(c)开始，进行剪枝处理
    //同时注意两数允许相同 所以是while(i<=j)
    public boolean judgeSquareSum(int c) {
        int i=0,j=(int)Math.sqrt(c);
        while(i<=j){
            int num=i*i+j*j;
            if(num==c) return true;
            else if(num<c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
