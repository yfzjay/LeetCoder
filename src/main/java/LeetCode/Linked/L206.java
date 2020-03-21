package LeetCode.Linked;
//链表反转
public class L206 {
//递归法
    public ListNode reverseList1(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        //从最后开始反转，否则会断链
        //递归的向后找最后一个节点，即新的头结点。
        // 当返回时，说明后面的节点都已经反转并连接完成。
        //所以到达当前节点时，只需要让next连接到本节点，并让本节点next置为null
        ListNode newHead=reverseList1(next);
        next.next=head;
        head.next=null;
        return newHead;
    }
//头插法
    public ListNode reverseList2(ListNode head){
        ListNode tmpHead=new ListNode(1);
        while(head!=null){
            //顺序很重要
            ListNode next=head.next;
            head.next=tmpHead.next;
            tmpHead.next=head;
            head=next;
        }
        return tmpHead.next;
    }
}
