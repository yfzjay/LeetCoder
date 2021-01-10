package 剑指offer;

import java.util.ArrayList;

public class J34 {
    /*
    * 回溯问题，要注意的是返回成功的操作是在上一层还是下一层完成
    * 对于该题来说，如果在下一层完成，因为有左右两个孩子，因此会有两个相同的结果加到结果列表中
    * 因此只能在上一层完成
    * */
    private ArrayList<ArrayList<Integer>> res;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        res=new ArrayList<>();
        if(root==null||target<0){
            return res;
        }
        dfs(root,target,new ArrayList<Integer>());
        return res;
    }
    private void dfs(TreeNode treeNode,int target,ArrayList<Integer> list){
        if(treeNode==null||target<=0){
            return;
        }
        list.add(treeNode.val);
        target-=treeNode.val;
        if(target==0&&treeNode.left==null&&treeNode.right==null){
            res.add(list);
        }else{
            dfs(treeNode.left,target,list);
            dfs(treeNode.right,target,list);
        }
        list.remove(list.size()-1);
    }

}
