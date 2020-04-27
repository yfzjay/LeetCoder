package LeetCode.TwoPoint;

import java.util.Arrays;
import java.util.HashSet;

public class L345 {
    //调换对称的两个元音字母 用双指针解决
    //当一个不是时，就加到结果数组中，相应指针移动
    //当两个都是元音时，交换位置加到数组中，指针移动
    //最后如果有一个元音没有对应的，i和j会相遇，同样加到结果中,因此是while(i<=j)
    private HashSet<Character> yuan=new HashSet<>(Arrays.asList('a','e','i','o','u',
            'A','E','I','O','U'));
    public String reverseVowels(String s) {
        char[] result=new char[s.length()];
        int i=0,j=s.length()-1;
        while(i<=j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(!yuan.contains(c1)){
                result[i++]=c1;
            }else if (!yuan.contains(c2)){
                result[j--]=c2;
            }else{
                result[i++]=c2;
                result[j--]=c1;
            }
        }
        return new String(result);
    }
}
