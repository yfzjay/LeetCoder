package LeetCode.Tree;

public class L687 {
    public int maxx=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return maxx;
        dfs(root);
        return maxx;
    }

    /*给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
    * 解题思路：
    * 返回的是：以当前节点为头节点，以当前节点的值作为同值，往下延伸的最长路径长度
    * 后序遍历，拿到左子树和右子树的最长长度，如果当前节点的值等于左节点值，说明可以和左子树
    *连接起来，否则左子树拿到的值作废。右子树同理。更新最长长度：左边更新过的+右边更新过的
    *返回的是左，右子树更新过得值的最大值。
    * */
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int ls=dfs(root.left);
        int rs=dfs(root.right);
        int samel=0,samer=0;
        if(root.left!=null&&root.val==root.left.val){
            samel=ls+1;
        }
        if(root.right!=null&&root.val==root.right.val){
            samer=rs+1;
        }
        maxx=Math.max(maxx,samel+samer+1);
        return Math.max(samel,samer);
    }
}
