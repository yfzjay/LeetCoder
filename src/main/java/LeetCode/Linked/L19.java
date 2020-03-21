package LeetCode.Linked;

public class L19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=head;
        while(n-->0){
            l1=l1.next;
        }
        ListNode l2=head;
        if(l1==null)return head.next;
        while(l1.next!=null){
            l1=l1.next;
            l2=l2.next;
        }
        l2.next=l2.next.next;
        return head;
    }
}
