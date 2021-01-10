package 剑指offer;

import LeetCode.Linked.ListNode;

    import java.util.HashMap;

public class J18_2 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null) return pHead;
        HashMap<Integer,Integer> map=new HashMap();
        ListNode pre,last;
        pre=pHead;
        while(pre!=null){
            map.put(pre.val,map.getOrDefault(pre.val,0)+1);
            pre=pre.next;
        }
        pre=pHead;
        while(pre.next!=null){
            last=pre.next;
            if(map.get(last.val)>1){
                pre.next=last.next;
                continue;
            }
            pre=pre.next;
        }
        return pHead;
    }
}
