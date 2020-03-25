package LeetCode.array;

public class L240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int m=matrix.length,n=matrix[0].length;
        int row=0,col=n-1;
        while(row<m&&col>=0){
            if(target==matrix[row][col]) return true;
            else if(target<matrix[row][col]){
                col--;
            }else if(target>matrix[row][col]){
                row++;
            }
        }
        return false;
    }
}
