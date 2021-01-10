package 剑指offer;

import LeetCode.Linked.ListNode;

public class J22 {
    //a b c d e
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode p1=head,p2=head;
        int i=0;
        while(p1!=null&&i<k){
            p1=p1.next;
        }
        if(p1==null){
            return new ListNode(-1);
        }
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
}
