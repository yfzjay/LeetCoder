package 剑指offer;

public class L27 {

    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    public void swap(TreeNode treeNode){
        TreeNode t=treeNode.left;
        treeNode.left=treeNode.right;
        treeNode.right=t;
    }
}
