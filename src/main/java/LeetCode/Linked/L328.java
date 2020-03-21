package LeetCode.Linked;

public class L328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;

        while((even!=null&&even.next!=null)){

            even.next=even.next.next;
            odd.next=odd.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    public ListNode oddEvenList1(ListNode head) {
       ListNode odd=new ListNode(-1);
       ListNode even=new ListNode(-1);
       ListNode l1=odd,l2=even;
       int count=1;
       while(head!=null){
           if(count%2!=0){
               l1.next=head;
               l1=l1.next;
           }else{
               l2.next=head;
               l2=l2.next;
           }
           head=head.next;
           count++;
       }
       l2.next=null;
       l1.next=even.next;
       return odd.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=l1;
        l3.next=l2;
        System.out.println(l3.val+" "+l1.next.val);
    }
}
