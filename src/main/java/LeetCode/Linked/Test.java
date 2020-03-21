package LeetCode.Linked;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Test {
    public static void f(Test x){
        x=new Test();

    }
    public static void main(String[] args) {
        int a=1;
        Test s=new Test();
        System.out.println(s);
        f(s);
        System.out.println(s);
    }
}
