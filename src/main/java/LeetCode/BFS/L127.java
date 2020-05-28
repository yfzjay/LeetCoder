package LeetCode.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int end=0;
        int n=wordList.size();
        while(end<n&&!wordList.get(end).equals(endWord)){
            end++;
        }
        if(end==n) return 0;
        wordList.add(beginWord);
        n=wordList.size();
        int start=n-1;
        List<Integer>[] lists = buildGraphic(wordList);
        Queue<Integer> queue=new LinkedList<>();
        boolean []mark=new boolean[n];
        mark[start]=true;
        queue.add(start);
        int path=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            path++;
            while(size-->0){
                int now = queue.poll();
                if(now==end) return path;
                for(int next:lists[now]){
                    if(mark[next]) continue;
                    mark[next]=true;
                    queue.add(next);
                }
            }
        }
        return 0;
    }
    private List<Integer>[] buildGraphic(List<String> wordList) {
        int N = wordList.size();
        List<Integer>[] graphic = new List[N];
        for (int i = 0; i < N; i++) {
            graphic[i] = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (isConnect(wordList.get(i), wordList.get(j))) {
                    graphic[i].add(j);
                }
            }
        }
        return graphic;
    }
    private boolean isConnect(String s1, String s2) {
        int diffCnt = 0;
        for (int i = 0; i < s1.length() && diffCnt <= 1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCnt++;
            }
        }
        return diffCnt == 1;
    }
}
