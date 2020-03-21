package LeetCode.string;

public class B2_17 {
    //字符串a循环移k位 reverse(reverse(a)+reverse(b)) 其中b为最后k个字符 需要注意的是防止
    //溢出 要取余

    //字符串所有单词反转 对每个单词反转 最后整个字符串反转
    public static String convert(String a,int k){
        int kk=k%a.length();
        String b=a.substring(0,a.length()-kk);
        String c=a.substring(a.length()-kk);
        return reverse(reverse(b)+reverse(c));
    }
    public static String reverse(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            res=s.charAt(i)+res;
        }
        return res;
    }
    public static String randomString(int len){
        String rex="";
        for(char a='0';a<='9';a++){
            rex+=a;
        }
        for(char i='a';i<='z';i++){
            rex+=i;
        }
        for(char i='A';i<='Z';i++){
            rex+=i;
        }
        int rexlen=rex.length();
        String res="";
        for(int i=0;i<len;i++){
            char c=rex.charAt((int) (Math.random()*rexlen));
            res+=c;
        }
        return res;
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("----"+i+"----");
            String s=randomString(10);
            System.out.println(s);
            System.out.println(convert(s,13));
        }
    }
}
