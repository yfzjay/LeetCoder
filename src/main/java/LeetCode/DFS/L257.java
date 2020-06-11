package LeetCode.DFS;

import LeetCode.Tree.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class L257 {

    private List<String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return res;
        dfs(root,new ArrayList<Integer>());
        return res;
    }
    public void dfs(TreeNode node,ArrayList<Integer> values){
        if(node==null) return;
        values.add(node.val);
        if(node.left==null&&node.right==null){
            String s=generateString(values);
            res.add(s);
        }
        dfs(node.left,values);
        dfs(node.right,values);
        values.remove(values.size()-1);
    }
    public String generateString(ArrayList<Integer> values){
        String s="";
        for(int value:values){
            s+=value;
            s+="->";
        }
        s.substring(0,s.length()-3);
        return s;
    }
}
