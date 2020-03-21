package LeetCode.Tree;

public class L226 {
    //反转树
    public TreeNode invertTree(TreeNode root) {
        if(null==root) return root;
        TreeNode left=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(left);
        return root;
    }
}
