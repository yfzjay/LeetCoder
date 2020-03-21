package LeetCode.Tree;

public class L101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return    isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode l1,TreeNode l2){
        if(l1==null&&l2==null) return true;
        if(l1==null||l2==null) return false;
        if(l1.val!=l2.val) return false;
        return isSymmetric(l1.left,l2.right)&&isSymmetric(l1.right,l2.left);
    }

}
