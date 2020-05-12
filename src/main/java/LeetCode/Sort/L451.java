package LeetCode.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class L451 {
    public String frequencySort(String s) {

        HashMap<Character,Integer> frequencyNum=new HashMap<>();
        for(char c:s.toCharArray()){
            frequencyNum.put(c,frequencyNum.getOrDefault(c,0)+1);
        }
        List<Character>[] frequent=new List[s.length()+1];
        for(Character key:frequencyNum.keySet()){
            int times=frequencyNum.get(key);
            if(frequent[times]==null){
                frequent[times]=new ArrayList<>();
            }
            frequent[times].add(key);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=frequent.length-1;i>=0;i--){
            if(frequent[i]==null) continue;
            for(char c:frequent[i]){
                sb.append(String.join("", Collections.nCopies(i, c + "")));
            }
        }
        return sb.toString();
    }
}
