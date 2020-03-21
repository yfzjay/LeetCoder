package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class L501 {
    private int maxc=1;
    private int cur=1;
    private TreeNode pre=null;
    //第一个节点没有pre 此时maxc=1=cur 当节点有pre 因为二叉排序树相同元素一定在一起 就更新
    //cur 最后更新 nums和maxc 并赋值pre
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> nums=new ArrayList<>();
        inorder(root,nums);
        int[] ret=new int[nums.size()];
        int i=0;
        for(int num:nums){
            ret[i++]=num;
        }
        return ret;
    }
    public void inorder(TreeNode root,List<Integer> nums){
        if(root==null) return;
        inorder(root.left,nums);
        if(pre!=null){
            if(pre.val==root.val){
                cur++;
            }else{
                cur=1;
            }
        }
        if(cur>maxc){
            nums.clear();
            maxc=cur;
            nums.add(root.val);
        }else if(cur==maxc){
            nums.add(root.val);
        }
        pre=root;
        inorder(root.right,nums);
    }
}
