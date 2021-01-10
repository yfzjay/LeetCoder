package 剑指offer;

import LeetCode.Linked.ListNode;

public class J25 {

    /*
    * 1-3-5
    * 2-4-6
    * 1-2-3-4-5-6
    * */
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode head=new ListNode(-1);
        ListNode cur=head;
        while(list1!=null&&list2!=null){
            if(list1.val<= list2.val){
                cur.next=list1;
                cur=cur.next;
                list1=list1.next;
            }else{
                cur.next=list2;
                cur=cur.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            cur.next=list1;
        }
        if (list2 != null) {
            cur.next=list2;
        }
        return head.next;
    }
}
