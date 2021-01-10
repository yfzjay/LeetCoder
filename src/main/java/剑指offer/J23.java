package 剑指offer;

import LeetCode.Linked.ListNode;

public class J23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow=pHead,fast=pHead;
        while(fast!=null&&fast.next!=null&&slow!=fast){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast==null||fast.next==null){
            return null;
        }
        fast=pHead;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
