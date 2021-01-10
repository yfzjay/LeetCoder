package 剑指offer;

import LeetCode.Linked.ListNode;

public class J24 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        while(head!=null){
            ListNode tmp=head.next;
            head.next=pre;
            pre=head;
            head=tmp;
        }
        return pre;
    }
    //翻转m到n个节点
    public ListNode ReversePartList(ListNode head,int m,int n) {
        if(head==null||head.next==null||m>=n) return head;
        ListNode first=new ListNode(-1);
        first.next=head;
        ListNode pre=first;
        for(int i=1;i<m;i++){
            pre=pre.next;
        }
        ListNode cur=pre.next;
        //1-2-3-4-5
        for(int i=m;i<n;i++){
            ListNode nxt=cur.next;
            //当前节点向后移
            cur.next=nxt.next;
            //后续节点头插
            nxt.next=pre.next;
            pre.next=cur;
        }
        return first.next;
    }

}
