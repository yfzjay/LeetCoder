package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L94 {
    private List<Integer> ret=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return ret;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            //先找到最左节点 再出栈一个 然后开始往右遍历 需要注意的是加入栈的不会为null
            //所以不需要再判断
            TreeNode t=stack.pop();
            ret.add(t.val);
            if(t.right!=null) cur=t.right;
        }
        return ret;
    }
}
