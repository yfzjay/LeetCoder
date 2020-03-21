package LeetCode.Linked;

public class L83 {
    public ListNode deleteDuplicates(ListNode head) {
        //同样是从最后开始向前去重
        //到达本节点时，后面的节点已经去重完成
        //因此只需要将当前节点和next去重，并将去重结果返回
        if(head==null) return head;
        if(head.next==null) return head;
        head.next=deleteDuplicates(head.next);
        return head.val==head.next.val?head.next:head;
    }
}
