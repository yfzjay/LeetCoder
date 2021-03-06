package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L32_2 {

    ArrayList<ArrayList<Integer>> res;
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        res=new ArrayList<>();
        if(pRoot==null){
            return  res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while(!queue.isEmpty()){
            ArrayList<Integer> tmp=new ArrayList<>();
            int size=queue.size();
            while(size-->0){
                TreeNode now=queue.poll();
                tmp.add(now.val);
                if(now.left!=null){
                    queue.add(now.left);
                }
                if(now.right!=null){
                    queue.add(now.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
