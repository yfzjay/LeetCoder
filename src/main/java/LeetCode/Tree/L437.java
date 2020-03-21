package LeetCode.Tree;

public class L437 {
    public int count=0;
    public int PathSum1(TreeNode root, int sum) {
        if(root==null) return 0;
        cal1(root,0,sum);
        PathSum1(root.left,sum);
        PathSum1(root.right,sum);
        return count;
    }
    public void cal1(TreeNode root,int nsum,int sum){
        if(root==null) return;
        nsum+=root.val;
        if(sum==nsum) count++;
        cal1(root.left,nsum,sum);
        cal1(root.right,nsum,sum);
    }
    public int PathSum2(TreeNode root,int sum){
        if(root==null) return 0;
        int ret=cal2(root,sum)+PathSum2(root.left,sum)+PathSum2(root.right,sum);
        return  ret;
    }
    public int cal2(TreeNode root,int sum){
        if(root==null) return 0;
        int ret=0;
        if(root.val==sum) ret++;
        ret+=cal2(root.left,sum-root.val)+cal2(root.right,sum-root.val);
        return ret;
    }

}

