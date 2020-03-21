package LeetCode.Tree;
/*
* 和687题思路相似
* 拿到左右的最大值后 更新最大值时 如果左或右最大值为负值就舍弃(置为0)，更新为maxl+maxr+root
* 返回的是以本节点作为根节点的一条连续路径的最大值 所以返回 max(maxl,maxr)+root
* */
public class L124 {
    private int maxx;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        maxx=root.val;
        dfs(root);
        return maxx;
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int ls=dfs(root.left);
        int rs=dfs(root.right);
        int ll=0,rr=0;
        if(ls>0) ll=ls;
        if(rs>0) rr=rs;
        maxx=Math.max(maxx,ll+rr+root.val);
        return Math.max(ll,rr)+root.val;
    }
}
