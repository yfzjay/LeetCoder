package LeetCode.greedy;

import java.util.Arrays;
import java.util.Collections;

public class L455 {
    //贪心思想 先给需求小的人分饼干 先给人分尽可能小的饼干
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int result=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
                result++;
            }
            j++;
        }
        return result;
    }
}
