package LeetCode.Divideandconquer;

import LeetCode.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class L95 {
    /*给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
    * 和96类似
    * */
    public List<TreeNode> generateTrees(int n) {
        if(n<1) return new LinkedList<TreeNode>();
        return dfs(1,n);
    }
    public List<TreeNode> dfs(int s,int e){
        List<TreeNode> result=new LinkedList<>();
        if(s>e){
            result.add(null);
            return result;
        }
        for(int i=s;i<=e;i++){
            List<TreeNode> lefts=dfs(s,i-1);
            List<TreeNode> rights=dfs(i+1,e);
            for(TreeNode left:lefts){
                for(TreeNode right:rights){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
