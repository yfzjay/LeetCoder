package LeetCode.Tree;

public class L236 {
    //查找普通二叉树的最低公共祖先
    //先判断p,q和root是否相等 如果相等 说明root就是结果 如果不等
    //去左，右子树中找 如果一个找到一个没找到 说明找到的就是
    //如两个都找到 说明当前root是
    //如果两个都没找到 说明最近公共祖先不在当前root下 返回null
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root==p||root==q) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }
}
