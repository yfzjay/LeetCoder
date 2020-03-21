package LeetCode.Tree;

public class L235 {
    //二叉查找树的最低公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(p.val<root.val&&q.val<root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        //当root的值再p,q之间或者等于某一个时，返回root就是最低公共祖先
        return root;
    }
}
