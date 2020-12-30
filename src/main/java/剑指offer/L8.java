package 剑指offer;

public class L8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null){
            return null;
        }
        if(pNode.right!=null){
            TreeLinkNode node=pNode.right;
            while(node.left!=null){
                node=node.left;
            }
            return node;
        }else{
            while(true){
                TreeLinkNode parent=pNode.next;
                if(parent==null){
                    return null;
                }
                if(parent.left==pNode){
                    return parent;
                }
                pNode=parent;
            }
        }

    }
}
