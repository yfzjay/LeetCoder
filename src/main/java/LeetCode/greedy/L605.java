package LeetCode.greedy;

public class L605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed==null) return false;
        int pre,last,result = 0;
        for(int i=0;i<flowerbed.length;i++){
            if(result>=n) break;
            if(flowerbed[i]==1) continue;
            pre=i==0?0:flowerbed[i-1];
            last=i==flowerbed.length-1?0:flowerbed[i+1];
            if(pre==0&&last==0){
                flowerbed[i]=1;
                result++;
            }
        }
        return result>=n;
    }
}
