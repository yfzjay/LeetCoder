package LeetCode.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class L513 {
    public int findBottomLeftValue(TreeNode root) {
        LinkedList<TreeNode> queue =new LinkedList<>();
        queue.addLast(root);
        TreeNode ret=null;
        while(!queue.isEmpty()){
            int cnt=queue.size();
            boolean flag=true;
            for(int i=0;i<cnt;i++){
                TreeNode t=queue.pollFirst();
                if(i==cnt-1) ret=t;
                if(t.right!=null){
                    flag=false;
                    queue.addLast(t.right);
                }
                if(t.left!=null){
                    flag=false;
                    queue.addLast(t.left);
                }
            }
            if(flag){
                break;
            }
        }
        return ret.val;
    }


}
