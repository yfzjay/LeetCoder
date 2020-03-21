package LeetCode.Tree;
//判断平衡树
public class T110 {
    public boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1) flag=false;
        return Math.max(lh,rh)+1;
    }

}
