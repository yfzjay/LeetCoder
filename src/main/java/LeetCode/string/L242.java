package LeetCode.string;

import java.util.HashMap;
import java.util.Map;

public class L242 {

    //判断两字符串组成的字符是否完全相同(包括每个字符数量)
    //简单做法就是用hashmap统计个数
    //或者用数组统计 一个数组加一个数组减 如果最后所有数组元素均为0 返回true
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hms=new HashMap<>();
        HashMap<Character,Integer> hmt=new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(char c:s.toCharArray()){
            hms.put(c,hms.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            hms.put(c,hmt.getOrDefault(c,0)+1);
        }
        for(Map.Entry entry:hms.entrySet()){
            char sc= (char) entry.getKey();
            if(!hmt.containsKey(sc)||!hmt.get(sc).equals(entry.getValue())) return false;
        }
        return true;
    }
    public boolean isAnagram1(String s, String t) {
        int []cnt=new int[26];
        for(char c:s.toCharArray()){
            cnt[c-'a']++;
        }
        for(char c:t.toCharArray()){
            cnt[c-'a']--;
        }
        for(int a:cnt){
            if(a!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println('a'=='a');
        System.out.println(new Character('c').equals(new Character('c')));
        System.out.println(new Integer(1)==new Integer(1));
    }
}
