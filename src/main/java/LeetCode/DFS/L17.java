package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

public class L17 {

    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null||digits.length()==0) return result;
        dfs(new StringBuilder(""),digits,result);
        return result;
    }
    public void dfs(StringBuilder tmp,String digit,List<String> result){
        if(tmp.length()==digit.length()){
            result.add(tmp.toString());
            return;
        }
        int len=tmp.length();
        int index=digit.charAt(len)-'0';
        String str=KEYS[index];
        for(char c:str.toCharArray()){
            tmp.append(c);
            dfs(tmp,digit,result);
            tmp.deleteCharAt(tmp.length()-1);
        }

    }

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4]=4;
        a[5]=5;

        System.arraycopy(a, 2, a, 3, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
