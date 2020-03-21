package LeetCode.string;

public class L9 {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x<0) return false;
        if(x%10==0) return false;
        int tmp=x,len=0;
        while(tmp!=0){
            tmp/=10;
            len++;
        }
        len/=2;
        int right=0;
        while(len-->0){
            right=right*10+x%10;
            x/=10;
        }
        return x==right||x/10==right;
    }

    public static void main(String[] args) {
        new L9().isPalindrome(0);
    }
}
