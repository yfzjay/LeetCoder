package LeetCode.array;

public class L769 {


    /*
    * 输入: arr = [1,0,2,3,4]
输出: 4
解释:
我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
方法：因为有序的时候该位置元素一定等于索引
* 维护一个到目前的最大值，如果和当前的index相同，说明之前的可以串起来有序
    * */
    public int maxChunksToSorted(int[] arr) {
        int max=arr[0];
        int result=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(max==i) result++;
        }
        return result;
    }
}
