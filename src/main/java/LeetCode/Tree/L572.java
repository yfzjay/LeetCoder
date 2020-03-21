package LeetCode.Tree;

public class L572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null) return false;
        if(s==null) return false;
        return cal(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean cal(TreeNode s,TreeNode t){
        if(s==null&&t==null) return true;
        if(s==null||t==null) return false;
        if(s.val!=t.val) return false;
        return cal(s.left,t.left)&&cal(s.right,t.right);
    }

    public static void main(String[] args) {

    }
}
