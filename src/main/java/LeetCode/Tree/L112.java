package LeetCode.Tree;

public class L112 {
    public boolean flag=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        cal(root,0,sum);
        return flag;
    }
    public void cal(TreeNode root,int nsum,int sum){
        if(root==null) return;
        nsum+=root.val;
        if(root.left==null&&root.right==null) {
            if(nsum==sum){
                flag=true;
                return;
            }
        }
        cal(root.left,nsum,sum);
        cal(root.right,nsum,sum);
    }
}
