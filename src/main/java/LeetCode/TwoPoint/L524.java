package LeetCode.TwoPoint;

import java.util.List;

public class L524 {

    //用双指针的方法判断是否是子序列
    private String result="";
    public String findLongestWord(String s, List<String> d) {
        for(String s2:d){
            if(result.length()>s2.length()||(result.length()==s2.length()&&result.compareTo(s2)<0)){
                continue;
            }
            if(isSubstr(s,s2)){
                result=s2;
            }
        }
        return result;
    }
    public boolean isSubstr(String s1,String s2){
        int i=0,j=0;
        while(i<s1.length()&&j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
            i++;
        }
        return j==s2.length();
    }
}
