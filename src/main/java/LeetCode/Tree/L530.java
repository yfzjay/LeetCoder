package LeetCode.Tree;

public class L530 {
    private int minn=Integer.MAX_VALUE;
    private TreeNode pre=null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minn;
    }
    //中序遍历 pre保存上一个节点 如果是第一个节点 pre=null 不做更新 用到了二叉排序树最小间隔元素一定
    //在一起的特性
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(pre!=null){
            minn=Math.min(minn,root.val-pre.val);
        }
        pre=root;
        inorder(root.right);
    }
    boolean a;
    public static void main(String[] args) {

        System.out.println(new L530().a);
    }
}
