package LeetCode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L637 {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ret=new ArrayList<>();
        if(root==null) return ret;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            double sum=0;
            int num=queue.size();
            for(int i=0;i<num;i++){
                TreeNode t=queue.poll();
                sum+=t.val;
                if(t.left!=null)
                    queue.add(t.left);
                if(t.right!=null)
                    queue.add(t.right);
            }
            ret.add(sum/num);
        }
        return ret;
    }
}
