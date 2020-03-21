package LeetCode.Tree;


import LeetCode.Linked.ListNode;

public class L109 {
    //用有序列表构建平衡的二叉排序树
    //用快慢节点找到中间节点 构建一个树节点 之后把mid断链 而后左右分制
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        //只剩一个节点在这返回 不然后面会空指针异常
        if(head.next==null){
            return new TreeNode(head.val);
        }
        //获取到中间节点的前一个 用于断链 因为到这里至少会有两个节点 因此不会空指针
        ListNode premid=premid(head);
        ListNode mid=premid.next;
        premid.next=null;
        TreeNode root=new TreeNode(mid.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(mid.next);
        return root;
    }
    public ListNode premid(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode fast=head.next,slow=head,pre=slow;
        while(fast!=null&&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return pre;
    }
}
