package LeetCode.TwoPoint;

public class L680 {
    //判断是否是回文串，可以删除一个元素
    //当两个元素不同，就删除左边或右边元素判断剩下的串是否满足
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalin(s,i,j-1)||isPalin(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalin(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
