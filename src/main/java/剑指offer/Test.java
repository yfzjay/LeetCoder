package 剑指offer;

public class Test {
    public TreeNode treeNode;

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }
    public void f(Test t){
        System.out.println(t.toString());
        t.treeNode.val=1;
    }

    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.toString());
        t.setTreeNode(new TreeNode(0));
        t.f(t);
        System.out.println(t.treeNode.val);
    }
}
