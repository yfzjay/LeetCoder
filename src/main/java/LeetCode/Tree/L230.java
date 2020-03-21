package LeetCode.Tree;

public class L230 {
    //查找二叉排序树第k小节点
    //中序遍历法
    private int ret=0;
    private int cnt=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return ret;
    }
    public void inOrder(TreeNode root,int k){
        if(root==null) return;
        inOrder(root.left,k);
        cnt++;
        if(cnt==k){
            ret=root.val;
        }
        inOrder(root.right,k);
    }
    //递归法 剪枝
    public int kthSmallest1(TreeNode root, int k) {
        if(root==null) return -1;
        int cnt=count(root.left);
        if(cnt==k-1){
            return  root.val;
        }else if(cnt>k-1){
            return kthSmallest1(root.left,k);
        }
        return kthSmallest1(root.right,k-cnt-1);
    }
    public int count(TreeNode root){
        if(root==null) return 0;
        return count(root.left)+count(root.right)+1;
    }
}
