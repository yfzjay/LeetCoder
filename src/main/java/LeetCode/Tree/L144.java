package LeetCode.Tree;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L144 {
    //递归：
    private List<Integer> ret=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        predfs(root);
        return ret;
    }
    public void predfs(TreeNode root){
        if(root==null) return;
        ret.add(root.val);
        predfs(root.left);
        predfs(root.right);
    }
    //非递归：
    public List<Integer> preorderTraversal1(TreeNode root) {
        if(root==null) return ret;
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!stack.empty()) {
            TreeNode t=stack.pop();
            ret.add(t.val);
            if(t.right!=null){//先把right压栈，再压left，保证出栈顺序为left->right
                stack.push(t.right);
            }
            if(t.left!=null){
                stack.push(t.left);
            }
        }
        return ret;
    }
}
