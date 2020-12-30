package 剑指offer;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;

public class L7 {

    HashMap<Integer,Integer> mapp;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        mapp=new HashMap<>();
        for(int i=0;i<pre.length;i++){
            mapp.put(pre[i],i);
        }
        //preL preR inL
        return f(pre,0,pre.length-1,0);
    }
    private TreeNode f(int[] pre,int preL,int preR,int inL){
        if(preL>preR){
            return null;
        }
        TreeNode root=new TreeNode(pre[preL]);
        int index=mapp.get(pre[preL]);
        root.left=f(pre,preL+1,preL+(index-inL),inL);
        root.right=f(pre,preL+(index-inL)+1,preR,index+1);
        return root;
    }
}
