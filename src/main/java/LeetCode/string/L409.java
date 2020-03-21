package LeetCode.string;

import java.io.UnsupportedEncodingException;

public class L409 {

    //找一个字符集合可构成的最长回文串 顺序不限制
    // 当字符出现次数为偶数 就加上这个数 如果为奇数 就比它少1
    //最后判断是否都加上了 如果没有 说明有奇数次出现的字符 再加上1 表示回文串中间那个值
    public int longestPalindrome(String s) {
        int[] cnt=new int[128];
        for(char c:s.toCharArray()){
            cnt[c]++;
        }
        int ret=0;
        for(int i:cnt){
            ret+=i/2*2;
        }
        if(ret<s.length()) ret++;
        return ret;
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1="放";
        String s2="c";
        byte[] b1=s1.getBytes("Unicode");
        byte[] b2=s2.getBytes("Unicode");

        for(int i=0;i<b1.length;i++){
            System.out.printf("%X ",b1[i]);
        }
        for(int i=0;i<b2.length;i++){
            System.out.printf("%X ",b2[i]);
        }
    }
}
