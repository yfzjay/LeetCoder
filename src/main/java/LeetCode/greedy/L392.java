package LeetCode.greedy;

public class L392 {

    public boolean isSubsequence(String s, String t) {
        int index=-1;
        for(char c:s.toCharArray()){
            index=t.indexOf(c,index);
            if(index==-1) return false;
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        new L392().isSubsequence("abc","xabgdc");
        System.out.println("abc".indexOf(0,'c'));
    }
}
