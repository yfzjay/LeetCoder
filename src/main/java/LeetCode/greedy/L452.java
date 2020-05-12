package LeetCode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L452 {
    public int findMinArrowShots(int[][] points) {
        if(points==null||points.length==0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int end=points[0][1];
        //不重叠数量
        int num=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=end) continue;
            num++;
            end=points[i][1];
        }
        return num;
    }
}
