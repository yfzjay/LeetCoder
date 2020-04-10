package LeetCode.Linked;

public class L92 {
    //头插法的思想解决一部分链表反转
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode first=new ListNode(-1);
        first.next=head;
        ListNode pre=first;
        for(int i=1;i<m;i++){
            pre=pre.next;
        }
        ListNode nxt=null,cur=pre.next;
        for(int i=m;i<n;i++){
            nxt=cur.next;
            //连接到后面的剩余链
            cur.next=nxt.next;
            //将next插到pre后
            nxt.next=pre.next;
            pre.next=nxt;
        }
        return first.next;
    }
}



