package LeetCode.array;

public class L378 {

    /*
    * 二分查找法：
    * 小于mid的数量为cnt。k>cnt 说明比mid大 lo=mid+1;k<=cnt 说明和mid相等或者比mid小
    * hi=mid-1 最后返回lo
    * */
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length,n=matrix[0].length;
        long lo=matrix[0][0],hi=matrix[m-1][n-1];
        while(lo<=hi){
            long mid=(lo+hi)/2,cnt=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n&&matrix[i][j]<=mid;j++){
                    cnt++;
                }
            }
            if (k>cnt) lo=mid+1;
            else hi=mid-1;
        }
        return (int) lo;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
