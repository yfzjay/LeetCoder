package LeetCode.Linked;

public class L234 {
    //用快慢指针找到中间节点
    //反转后半部分串，比较时一个遇到null结束
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode behind=reverseList1(slow.next);
        while(behind!=null&&head!=null){
            if(behind.val!=head.val){
                return false;
            }
            behind=behind.next;
            head=head.next;
        }
        return true;
    }
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
}
