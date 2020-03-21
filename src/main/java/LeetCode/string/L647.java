package LeetCode.string;

public class L647 {
    //统计字符串中的回文子串的数量 单个字符也算
    //统计以每个字符为中心位置往外扩散的回文子串 有奇数，偶数两种情况
    private int cnt=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            count(s,i,i);//统计奇数个情况
            count(s,i,i+1);//统计偶数个情况
        }
        return cnt;
    }
    public void count(String s,int start,int end){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            cnt++;
            start--;
            end++;
        }
    }
}
