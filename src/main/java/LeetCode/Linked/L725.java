package LeetCode.Linked;

public class L725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int N=0;
        ListNode cur=root;
        while(cur!=null){
            N++;
            cur=cur.next;
        }
        int mod=N%k;
        int basic=N/k;
        cur=root;
        ListNode[] ret=new ListNode[k];
        for(int i=0;i<k&&cur!=null;i++){
            ret[i]=cur;
            int now=mod>0?1:0;
            mod--;
            int size=basic+now;
            for(int j=0;j<size-1;j++){
                cur=cur.next;
            }
            ListNode next=cur.next;
            cur.next=null;
            cur=next;
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
