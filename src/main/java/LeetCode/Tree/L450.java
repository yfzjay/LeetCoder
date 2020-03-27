package LeetCode.Tree;

public class L450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode rightSmall=root.right;
            while(rightSmall.left!=null){
                rightSmall=rightSmall.left;
            }
            rightSmall.left=root.left;
            return root.right;
        }
        return root;
    }
}
