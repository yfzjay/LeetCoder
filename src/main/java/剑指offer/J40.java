package 剑指offer;
import java.util.*;
public class J40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        if(nums==null||k<0||k>nums.length){
            return new ArrayList<>();
        }
        int l=0,h=nums.length-1;
        while(l<h){
            int m=partition(nums,l,h);
            if(m==k-1){
                break;
            }else if(m>k-1){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=k-1;i++){
            res.add(i);
        }
        return res;
    }
    private int partition(int[] num,int l,int h){
        int p=num[l];
        int i=l,j=h+1;
        while (true){
            while(i!=h&&num[++i]<p);
            while(j!=l&&num[--j]>p);
            if(i>=j){
                break;
            }
            swap(num,i,j);
        }
        swap(num,l,j);
        return j;
    }
    private void swap(int[] num,int i,int j){
        num[i]^=num[j];//a=a^b
        num[j]^=num[i];//b=b^a^b=a
        num[i]^=num[j];//a=a^b^a=b
    }

    public static void main(String[] args) {
        int[] num={2,3,4};
        new J40().swap(num,0,2);
        System.out.println(num[0]+" "+num[2]);
    }
}

