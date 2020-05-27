package LeetCode.greedy;

import java.util.ArrayList;
import java.util.List;

public class L763 {

    public List<Integer> partitionLabels(String S) {
        int []charLastIndex=new int[26];
        int index=0;
        for(char c:S.toCharArray()){
            charLastIndex[c-'a']=index++;
        }
        List<Integer> result=new ArrayList<>();
        index=0;
        int lastIndex=0;
        while(index<S.length()){
            lastIndex=index;
            int now=index;
            for(int i=index;i<S.length()&&i<=lastIndex;i++){
                now=charLastIndex[S.charAt(i)-'a'];
                if(now>lastIndex){
                    lastIndex=now;
                }
            }
            result.add(lastIndex-index+1);
            index=lastIndex+1;
        }
        return result;
    }

    public static void main(String[] args) {
        new L763().partitionLabels("ababcbacadefegdehijhklij");
    }
}
