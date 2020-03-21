package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class L653 {
    //中序遍历 把节点值存在数组中 形成有序列表 而后 用两个指针遍历数组 找目标和
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> nums=new ArrayList<>();                                                                                                                                                                                                                                                                                                         
        inorder(root,nums);
        int l=0,r=nums.size()-1;
        while(l<r){
            int sum=nums.get(l)+nums.get(r);
            if(sum==k) break;
            if(k>sum) l++;
            else r--;
        }
        if(l==r) return false;
        else return true;
    }
    public void inorder(TreeNode root,List<Integer> nums){
        if(root==null) return;
        inorder(root.left,nums);
        nums.add(root.val);
        inorder(root.right,nums);
    }
}
