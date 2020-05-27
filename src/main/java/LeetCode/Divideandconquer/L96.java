package LeetCode.Divideandconquer;

public class L96 {
    /*给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？

示例:

输入: 3
输出: 5
解释:
给定 n = 3, 一共有 5 种不同结构的二叉搜索树:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

   假设n个节点存在二叉排序树的个数是G(n)，1为根节点，2为根节点，...，n为根节点，
   当1为根节点时，其左子树节点个数为0，右子树节点个数为n-1，
   同理当2为根节点时，其左子树节点个数为1，右子树节点为n-2，
   所以可得G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)

   这里还可加入剪枝操作
*/
    private int []g;
    private boolean []b;
    public int numTrees(int n) {
        g=new int[n+1];
        b=new boolean[n+1];
        b[0]=true;
        g[0]=1;
        int result=dfs(n);
        return result;
    }
    public int dfs(int n){
        if(n==0) return 0;
        if(b[n]) return g[n];
        int result=0;
        for(int i=1;i<=n;i++){
            int leftNum=b[i-1]?g[i-1]:dfs(i-1);
            int rightNum=b[n-i]?g[n-i]:dfs(n-i);
            result+=(leftNum*rightNum);
        }
        b[n]=true;
        g[n]=result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L96().numTrees(3));

    }
}
