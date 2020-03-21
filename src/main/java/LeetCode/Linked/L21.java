package LeetCode.Linked;
//合并两个有序链表
/*
* 每次都返回当前两链表的最小节点，有一个为null时就返回另一个链表节点，直至两链表都循环完了
* */
public class L21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<=l2.val){
            //当l1节点小，说明此时剩余最小的节点是l1,就返回l1，即消耗掉l1,l1的next接着递归得到
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
