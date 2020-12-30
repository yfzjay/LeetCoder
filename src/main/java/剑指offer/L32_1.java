package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L32_1 {
    private List<Integer> res;
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        res=new ArrayList<>();
        if(root==null){
            return (ArrayList<Integer>) res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                TreeNode now=queue.poll();
                res.add(now.val);
                if(now.left!=null){
                    queue.add(now.left);
                }
                if(now.right!=null){
                    queue.add(now.right);
                }
            }
        }
        return (ArrayList<Integer>) res;
    }
}
