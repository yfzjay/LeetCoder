package LeetCode.TwoPoint;

public class L88 {
    /*
    * 合并两个有序数组 要求合并到第一个数组上
    * 要从后面放新元素 否则会覆盖第一个数组中还没有判断的元素
    * */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0||j>=0){
            if(i<0){
                nums1[k--]=nums2[j--];
            }else if(j<0){
                nums1[k--]=nums1[i--];
            }else if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
    }
}
