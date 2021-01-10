package 剑指offer;

public class J58_1 {
    public String ReverseSentence(String str) {
        int n=str.length();
        int s=0,e=0;
        char[] strs=str.toCharArray();
        for(;e<=n;e++){
            if(e==n||strs[e]==' '){
                reverseString(strs,s,e-1);
                s=e+1;
            }
        }
        return strs.toString();
    }
    private void reverseString(char[] str,int i,int j){
        while(i<j){
            char tmp=str[i];
            str[i]=str[j];
            str[j]=tmp;
            i++;
            j--;
        }
    }
}
