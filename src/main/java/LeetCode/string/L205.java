package LeetCode.string;

public class L205 {
    //判断字符串是否同构 记录每个字符上次出现的位置 刚开始均为0 如果出现位置都相同说明同构
    //需要注意的是 位置要加上1 防止让0位置元素和未出现元素搞混
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []i1=new int[128];
        int []i2=new int[128];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(i1[c1]!=i2[c2]) return false;
            i1[c1]=i+1;
            i2[c2]=i+1;
        }
        return true;
    }
}
