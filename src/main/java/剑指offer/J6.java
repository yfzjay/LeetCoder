package 剑指offer;

import LeetCode.Linked.ListNode;

import java.util.ArrayList;

public class J6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode newhead=new ListNode(-1);
        while(listNode!=null){
            ListNode tmp=listNode.next;
            listNode.next=newhead.next;
            newhead.next=listNode;
            listNode=tmp;
        }
        ArrayList<Integer> res=new ArrayList<>();
        newhead=newhead.next;
        while(newhead!=null){
            res.add(newhead.val);
            newhead=newhead.next;
        }
        return res;
    }
    public ListNode deleteNodeO1(ListNode root,ListNode deleteNode){
        if(root==null||deleteNode==null) return root;
        //只有一个头结点 直接删除
        if(root.next==null) {
            return null;
        }
        //如果是最后一个节点，必须找出前序节点
        if(deleteNode.next==null){
            ListNode pre=root;
            while(pre.next!=deleteNode){
                pre=pre.next;
            }
            pre.next=null;
        //否则把下个节点值赋值过来，删除下一个节点
        }else{
            deleteNode.val=deleteNode.next.val;
            deleteNode.next=deleteNode.next.next;
        }
        return root;
    }
}
