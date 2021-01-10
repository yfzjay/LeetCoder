package 剑指offer;

public class J4 {

    public String replaceSpace(StringBuffer str) {
        int p1=str.length()-1;
        for (int i=0;i<=p1;i++){
            if(str.charAt(i)==' '){
              str.append("  ");
            }
        }
        int p2=str.length()-1;
        for(;p1>=0;p1--){
            if(p2==p1)
                break;
            if(str.charAt(p1)==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }else{
                str.setCharAt(p2--,str.charAt(p1));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        new J4().replaceSpace(new StringBuffer("h x"));
    }
}
