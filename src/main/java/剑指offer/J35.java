package 剑指offer;

import LeetCode.Linked.ListNode;
import LeetCode.Linked.RandomListNode;

public class J35 {
    public RandomListNode Clone(RandomListNode pHead) {

        if(pHead==null) return null;
        RandomListNode cur=pHead;
        //插入新节点
        while(cur!=null){
            RandomListNode nxt=cur.next;
            RandomListNode clone=new RandomListNode(cur.label);
            clone.next=nxt;
            cur.next=clone;
            cur=nxt;
        }
        //复制random连接
        cur=pHead;
        while(cur!=null){
            RandomListNode clone=cur.next;
            clone.random=cur.random.next;
            cur=clone.next;
        }
        //拆分
        cur=pHead;
        RandomListNode newhead=cur.next;
        while(cur.next!=null){
            RandomListNode nxt=cur.next;
            cur.next=nxt.next;
            cur=nxt;
        }
        return newhead;
    }
}
