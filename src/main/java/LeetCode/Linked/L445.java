package LeetCode.Linked;

import java.util.Stack;

public class L445 {
    //带上进位
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=buildStack(l1);
        Stack<Integer> s2=buildStack(l2);
        int carry=0;
        ListNode head=new ListNode(-1);
        ListNode n=null;
        while(!s1.empty()||!s2.empty()||carry!=0){
            int v1=s1.empty()?0:s1.pop();
            int v2=s2.empty()?0:s2.pop();
            int val=v1+v2+carry;
            carry=val/10;
            n=new ListNode(val%10);
            n.next=head.next;
            head.next=n;
        }
        return head.next;
    }
    public Stack<Integer> buildStack(ListNode head){
        Stack<Integer> s=new Stack<>();
        while(head!=null){
          s.push(head.val);
          head=head.next;
        }
        return s;
    }
}
