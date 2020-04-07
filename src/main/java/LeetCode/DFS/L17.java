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

}
