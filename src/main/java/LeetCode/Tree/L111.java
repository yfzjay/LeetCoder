package LeetCode.Tree;

public class L111 {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        if(l==0&&r==0) return 1;
        if(l==0||r==0) return l+r+1;
        return Math.min(l,r)+1;
    }
}
