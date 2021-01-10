package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J38 {
    ArrayList<String> res=new ArrayList<>();
    private boolean[] flag;
    public ArrayList<String> Permutation(String str) {
        if(str==null||str.length()==0) return res;
        flag=new boolean[str.length()+1];
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        dfs(new StringBuilder(),chars);
        return res;
    }
    public void dfs(StringBuilder str,char[] src){
        if(str.length()==src.length){
            res.add(str.toString());
            return;
        }
        for(int i=0;i<src.length;i++){
            if(flag[i]) continue;
            if(i!=0&&src[i]==src[i-1]&&!flag[i-1]) continue;
            str.append(src[i]);
            flag[i]=true;
            dfs(str,src);
            flag[i]=false;
            str.deleteCharAt(str.length()-1);
        }
    }
}
