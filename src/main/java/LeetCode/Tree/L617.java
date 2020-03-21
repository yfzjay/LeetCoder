package LeetCode.Tree;

public class L617 {
    //合并两个树，如果该位置两个树都有，是两个树节点值之和，否则为其中一个
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null) return null;
        if(t1==null) return t2;
        if(t2==null) return t1;
        TreeNode node=new TreeNode(t1.val+t2.val);
        node.right=mergeTrees(t1.right,t2.right);
        node.left=mergeTrees(t1.left,t2.left);
        return node;
    }
}
