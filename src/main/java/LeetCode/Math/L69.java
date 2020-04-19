package LeetCode.Math;

public class L69 {
    //用二分法求开平方根 需要注意的是这里while(l<=h) 退出循环时l=h+1 因此返回h
    public int mySqrt(int x) {
        if(x<=1) return x;
        int l=1,h=x;
        while(l<=h){
            int mid=(l+h)/2;
            int sqrt=x/mid;
            if(mid==sqrt) return mid;
            else if(mid>sqrt) h=mid-1;
            else l=mid+1;
        }
        return h;
    }
}
