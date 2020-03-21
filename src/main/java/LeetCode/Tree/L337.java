package LeetCode.Tree;

public class L337 {
    public int rob(TreeNode root) {
        if(root==null) return 0;
        int ll = 0,lr=0,rl=0,rr=0;
        if(root.left!=null){
            ll=rob(root.left.left);
            lr=rob(root.left.right);
        }
        if(root.right!=null){
            rl=rob(root.right.left);
            rr=rob(root.right.right);
        }
        int ls=rob(root.left);
        int rs=rob(root.right);
        return Math.max(root.val+ll+lr+rl+rr,ls+rs);
    }
}
