package LeetCode.array;

public class L667 {
    public int[] constructArray(int n, int k) {

        int []res=new int[n];
        res[0]=1;
        int interval=k;
        for(int i=1;i<=k;i++){
            if(i%2==1){
                res[i]=res[i-1]+interval;
            }else{
                res[i]=res[i-1]-interval;
            }
            interval--;
        }
        for(int i=k+1;i<n;i++){
            res[i]=i;
        }
        return res;
    }
}
