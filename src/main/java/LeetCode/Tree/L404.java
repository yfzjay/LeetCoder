package LeetCode.Tree;

public class L404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(isLeaf(root.left)) return root.left.val+sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
    public boolean isLeaf(TreeNode root){
        if(root==null) return false;
        if(root.left==null&&root.right==null) return true;
        else return false;
    }
}
