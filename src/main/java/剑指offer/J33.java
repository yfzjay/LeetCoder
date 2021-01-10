package 剑指offer;

public class J33 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null||sequence.length==0){
            return false;
        }
        return verify(sequence,0,sequence.length-1);
    }
    private boolean verify(int[] nums,int first,int end){
        if(end-first<=1){
            return true;
        }
        int cut=0;
        for(;cut<end&&nums[cut]<=nums[end];cut++);
        for(int i=cut+1;i<end;i++){
            if(nums[i]<=nums[end]){
                return false;
            }
        }
        return verify(nums,0,cut)&&verify(nums,cut+1,end-1);
    }
}
