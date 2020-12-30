package 剑指offer;

public class L28 {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null){
            return true;
        }
        return f(pRoot.left,pRoot.right);
    }
    private boolean f(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return f(left.left,right.right)&&f(left.right,right.left);
    }
}
