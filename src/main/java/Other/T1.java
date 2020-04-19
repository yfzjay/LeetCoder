package Other;

import LeetCode.Linked.ListNode;

//去除顺序数组或链表中的重复元素 利用快慢指针
public class T1 {
    //返回去重后的数组长度
    public int delMultiArray(int[] arr){
        if(arr.length==1){
            return 1;
        }
        int slow=0,fast=1;
        while(fast<arr.length){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];
            }
            fast++;
        }
        return slow+1;
    }
    public ListNode delMultiLinked(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode slow=head,fast=slow.next;
        while(fast!=null){
            if(slow.val!=fast.val){
                slow.next=fast;
                slow=slow.next;
            }
            fast=fast.next;
        }
        slow.next=null;
        return head;
    }
}
