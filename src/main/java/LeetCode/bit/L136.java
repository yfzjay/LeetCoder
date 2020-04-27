package LeetCode.bit;

import java.io.FileNotFoundException;

public class L136 {

    public int singleNumber(int[] nums) {
        //0^x=x x^x=0
        int z=0;
        for(int num:nums){
            z=z^num;
        }
        return z;
    }
    public static void test(int i) {
        if(i==1)
            throw new NullPointerException("异常1");
        else if(i==2){
            throw new NullPointerException("异常2");
        }else if(i==3){
            throw new IndexOutOfBoundsException("异常3");
        }else if(i==4){
            throw new ArithmeticException("ss");
        }
    }
    public static void main(String[] args) {
        try{
            test(4);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println(e.getMessage());
            }
        }
    }
}
