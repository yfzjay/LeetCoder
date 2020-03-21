package LeetCode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class L145 {
    //递归：
    private List<Integer> ret=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postdfs(root);
        return ret;
    }
    public void postdfs(TreeNode root){
        if(root==null) return;
        postdfs(root.left);
        postdfs(root.right);
        ret.add(root.val);
    }
    //非递归：
    //把前序遍历的压栈顺序改变，访问顺序变成root->right->left
    //最后再把数组反转就得到后序遍历
    public List<Integer> postorderTraversal1(TreeNode root) {
        if(root==null) return ret;
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!stack.empty()) {
            TreeNode t=stack.pop();
            ret.add(t.val);
            if(t.left!=null){
                stack.push(t.left);
            }
            if(t.right!=null){
                stack.push(t.right);
            }

        }
        Collections.reverse(ret);
        return ret ;
    }

}
