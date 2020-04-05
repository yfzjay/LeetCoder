package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

public class L93 {
    /*
    * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
    示例:
    输入: "25525511135"
    输出: ["255.255.11.135", "255.255.111.35"]
    *
    * */
    public List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        StringBuilder tmp=new StringBuilder();
        dfs(0,tmp,result,s);
        return result;
    }
    public void dfs(int k,StringBuilder tmp,List<String> result,String s){
        if(k==4||s.length()==0){
            //当k=4但s没用完或者s用完了k!=4，都不是合格IP
            if(k==4&&s.length()==0){
                result.add(tmp.toString());
            }
            return;
        }
        for(int i=0;i<=2&&i<s.length();i++){
            //排除Ip中的以0打头的长度大于1的项
            if(i!=0&&s.charAt(0)=='0'){
                break;
            }
            String part=s.substring(0,i+1);
            if(Integer.parseInt(part)<=255){
                if(tmp.length()!=0){
                    part="."+part;
                }
                dfs(k+1,tmp.append(part),result,s.substring(i+1));
                //一定记得回溯
                tmp.delete(tmp.length()-part.length(),tmp.length());
            }
        }
    }
}
