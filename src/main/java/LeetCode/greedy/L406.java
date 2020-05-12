package LeetCode.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class L406 {
    /*
    * 贪心思想，按身高降序顺序，身高相同的序号升序处理数据，按照序号加入到对应位置
    * 为了使插入操作不影响后续的操作，身高较高的学生应该先做插入操作，
    * 否则身高较小的学生原先正确插入的第 k 个位置可能会变成第 k+1 个位置。
    * */
    public int[][] reconstructQueue(int[][] people) {
        if(people==null||people.length==0||(people[0]==null)||people[0].length==0){
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o2[0]-o1[0];
                }
            }
        });
        List<int[]> nums=new LinkedList<>();
        for(int i=0;i<people.length;i++){
            nums.add(people[i][1],people[i]);
        }
        return nums.toArray(new int[nums.size()][2]);
    }

    public static void main(String[] args) {
        int [][]arr=new int[5][0];
        System.out.println(arr.length+"\n"+(arr[0]!=null)+"\n");
        System.out.println(arr[0][0]);
    }
}
