package LeetCode.DFS;


public class L60 {
    private String result="";
    private StringBuilder tmp;
    private int n,k;
    private int now;
    private boolean flag;
    private int[] visit;
    public String getPermutation(int n, int k) {
        this.n=n;
        this.k=k;
        this.now=0;
        this.flag=false;
        tmp=new StringBuilder("");
        visit=new int[n+1];
        dfs(0);
        return result;
    }
    public void dfs(int num){
        if(num==n){
            now++;
            if(now==k){
                result=tmp.toString();
                flag=true;
            }
            return;
        }
        for(int i=1;i<=n;i++){
            if(flag) return;
            if(visit[i]==1) continue;
            tmp.append((char)(i+'0'));
            visit[i]=1;
            dfs(num+1);
            visit[i]=0;
            tmp.deleteCharAt(tmp.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println((int)'0');
    }
}
