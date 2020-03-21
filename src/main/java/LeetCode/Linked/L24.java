package LeetCode.Linked;

public class L24 {
    public ListNode swapPairs(ListNode head) {
        //构造一个节点在链表第一个前面，以找到第一个第二个节点
        ListNode node=new ListNode(-1);
        node.next=head;
        //要构造一个新节点保存node，node向后迭代
        ListNode pre=node;
        //如果链表为空或只有一个节点，就不会进入循环
        while(node.next!=null&&node.next.next!=null){
            ListNode l1=node.next;
            ListNode l2=l1.next;
            l1.next=l2.next;
            l2.next=l1;
            node.next=l2;
            node=l1;
        }
        return pre.next;
    }
}
