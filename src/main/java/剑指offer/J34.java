package 剑指offer;

import java.util.ArrayList;

public class J34 {

    private ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            if(root==null) return res;
            dfs(target,new ArrayList<Integer>(),root);
            return res;
    }
    public void dfs(int target,ArrayList<Integer> path,TreeNode node){
        if(node==null||target<0){
            return;
        }
        target-=node.val;
        path.add(node.val);
        if(node.left==null&&node.right==null&&target==0){
            res.add(new ArrayList<>(path));//注意这里要新New
        }else{
            dfs(target,path,node.left);
            dfs(target,path,node.right);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(7);
        root.right=new TreeNode(12);
        new J34().FindPath(root,22);
    }
}
