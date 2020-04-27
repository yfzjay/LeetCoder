package LeetCode.TwoPoint;

import LeetCode.Linked.ListNode;

public class L142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        boolean flag=false;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                flag=true;
                break;
            }
        }
        if(flag){
            fast=head;
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }else{
            return null;
        }

    }
}
