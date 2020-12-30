package 剑指offer;

import java.util.HashMap;

public class L26 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return f(root1,root2)|| HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    private boolean f(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return f(root1.left,root2.left)&&f(root1.right,root2.right);
    }
}
