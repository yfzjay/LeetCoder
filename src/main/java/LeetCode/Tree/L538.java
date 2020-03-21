package LeetCode.Tree;

public class L538 {
    //累加 right->root->left这样遍历 每个节点值要加上之前的累加和
    private int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null;
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.right);
        root.val+=sum;
        sum=root.val;
        dfs(root.left);
    }
}
