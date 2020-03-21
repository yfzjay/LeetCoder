package LeetCode.Tree;

import java.util.TreeSet;

public class L14 {

 /*   TreeSet<Integer> ts=new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        ts.add(root.val);
        dfs(root);
        if(ts.size()==1) return -1;
        return (int) ts.toArray()[1];
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        ts.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }*/

 /*
 * 找第二小节点 二叉树是小顶堆 root一定是min
 * 每次返回当前子树最小值，如果不存在，返回-1
 * 先判断当前节点是否大于min 如果大于 ，它所代表的子树的第二小节点就是它本身 不用再往下搜索
 * 否则后序遍历拿到 左右子树 的第二小的值，如果是-1，说明空节点，返回另一个，如果两个都是空节点，返回-1
 * 符合题意。 如果两个都不是-1，取两者中较小者返回
 * */
   public int findSecondMinimumValue(TreeNode root){
       if(root==null) return -1;
       return dfs1(root,root.val);
   }
   public int dfs1(TreeNode root,int min){
       if(root==null) return -1;
       if(root.val>min) return root.val;
       int ls=dfs1(root.left,min);
       int rs=dfs1(root.right,min);
       if(ls==-1) return rs;
       if(rs==-1) return ls;
       return Math.min(ls,rs);
   }

}
