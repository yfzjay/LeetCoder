package LeetCode.Tree;

public class T104 {
    //树的高度
    public int maxDepth(TreeNode root) {
        if(null==root) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public static void main(String[] args) {

    }
}
