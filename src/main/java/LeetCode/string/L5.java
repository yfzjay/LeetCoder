package LeetCode.string;

public class L5 {
    //最长回文子串 用中心扩散法 o(n2) o(n)
    private String maxs="";
    private int maxn=0;
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0) return maxs;
        String tmp;

        for(int i=0;i<s.length();i++){
            tmp=count(s,i,i);//统计奇数个情况
                if(tmp.length()>maxn){
                maxn=tmp.length();
                maxs=tmp;
            }
            tmp=count(s,i,i+1);//统计偶数个情况
            if(tmp.length()>maxn){
                maxn=tmp.length();
                maxs=tmp;
            }
        }
        return maxs;
    }
    public String count(String s,int start,int end){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        int x=start+1,y=end-1;
        return s.substring(x,y+1);
    }

    public static void main(String[] args) {
        System.out.println("cb".compareTo("a"));
    }
}
