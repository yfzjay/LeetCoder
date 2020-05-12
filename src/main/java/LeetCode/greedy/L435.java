package LeetCode.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L435 {
    /*
    * 贪心思想，把最多不重叠的减去就是最少需要剔除的区间数，对区间的尾部排序，每次选择尾部最小的，并且和前一个区间不重叠的
    * */
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals==null||intervals.length==0) return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int end=intervals[0][1];
        //不重叠数量
        int num=1;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end) continue;
            num++;
            end=intervals[i][1];
        }
        return intervals.length-num;
    }
}
