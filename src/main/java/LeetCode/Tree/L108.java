package LeetCode.Tree;

public class L108 {
    //用有序数组构造平衡的二叉查找树 用区间分制的做法
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0) return null;
        return dfs(nums,0,nums.length-1);
    }
    public TreeNode dfs(int[] nums,int l,int r){
        if(l>r) return null;
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=dfs(nums,l,mid-1);
        root.right=dfs(nums,mid+1,r);
        return root;
    }
}
