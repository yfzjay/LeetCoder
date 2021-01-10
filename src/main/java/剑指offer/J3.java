package 剑指offer;

/*
  如果求解第一个元素：
* 利用bitmap求解
  如果不限制：
  利用该位置有无该元素，交换到对应正确位置求解
* */
public class J3 {

    private int[] bigArray;
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        if(numbers.length==0){
            return false;
        }
        bigArray =new int[(int) (length/ 32 + 1)];

        for(int i=0;i<numbers.length;i++){
            if(isExist(numbers[i])){
                duplication[0]=numbers[i];
                return true;
            }else{
                set1(numbers[i]);
            }
        }
        return false;
    }
    public void swap(int num[],int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public void set1(int  num){
        //确定数组 index
        int arrayIndex = num >> 5;
        //确定bit index
        int bitIndex = num & 31;
        //设置0
        bigArray[arrayIndex] |= 1 << bitIndex;
    }
    /**
     * 将整型数字转换为二进制字符串，一共32位，不舍弃前面的0
     * @param number 整型数字
     * @return 二进制字符串
     */
    private static String get32BitBinString(int number) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 32; i++){
            sBuilder.append(number & 1);
            number = number >>> 1;
        }
        return sBuilder.reverse().toString();
    }
    public void set0(int  num){
        //确定数组 index
        int arrayIndex = num >> 5;
        //确定bit index
        int bitIndex = num & 31;
        //设置0
        bigArray[arrayIndex] &= ~(1 << bitIndex);
        System.out.println(get32BitBinString(bigArray[arrayIndex]));
    }

    public boolean isExist(int  num){
        //确定数组 index
        int arrayIndex = num >> 5;
        //确定bit index
        int bitIndex = num % 32;

        //判断是否存在
        return (bigArray[arrayIndex] & ((1 << bitIndex)))!=0 ? true : false;
    }

}
