package LeetCode.Tree;

public class L543 {
    //求树的直径：最远的两节点距离
    public int maxl=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxl;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        maxl=Math.max(maxl,lh+rh);
        return Math.max(lh,rh)+1;
    }
}
