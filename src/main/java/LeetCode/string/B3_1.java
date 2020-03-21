package LeetCode.string;

public class B3_1 {
    //判断字符串a循环移位后得到的字符串是否包含字符串b
    //a+a的字符串一定包含a循环移位任意一个字符串 因此可以用来判断b
    public boolean iscontain(String a,String b){
        if(a==null||a.length()==0||b==null||b.length()==0) return false;
        String c=a+a;
        return c.contains(b);
    }
}
