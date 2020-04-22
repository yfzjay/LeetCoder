package LeetCode.bit;

public class L318 {
    public int maxProduct(String[] words) {
        int[] num=new int[words.length];
        int i=0;
        for(String word:words){
            for(char c:word.toCharArray()){
                num[i]|=1<<(c-'a');
            }
            i++;
        }
        int result=0;
        for(int j=0;j<words.length;j++){
            for(int k=j+1;k<words.length;k++){
                if((num[j]&num[k])==0){
                    result=Math.max(result,words[j].length()*words[k].length());
                }
            }
        }
        return result;
    }
}
