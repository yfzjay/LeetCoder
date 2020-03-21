package LeetCode.StackQueue;

import java.util.Stack;

public class L739 {
    //用一个栈存放下标(没有解决的下标)，每次开始从栈顶检查，
    // 如果比当前数值小，那么它的最近比它大的元素就是本数
    //直到找到一个比它大的数值 说明 在它前面的的数一定比他大。
    // 每次解决一个就pop出去，以后不用在更新。
    public int[] dailyTemperatures(int[] T) {
        int[] dist=new int[T.length];
        Stack<Integer> indexs=new Stack<>();
        for(int i=0;i<T.length;i++){
            while(!indexs.isEmpty()&&T[i]>T[indexs.peek()]){
                int in=indexs.pop();
                dist[in]=i-in;
            }
            indexs.add(i);
        }
        return dist;
    }
}
