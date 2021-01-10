package Other;

import java.util.HashMap;
import java.util.Map;

public abstract class T2 {
    String a;
    String b;
    public T2(){
        a="1";
        b="2";
    }
    public void f1(){
        System.out.println("T2 f1");
    }
    public void f2(){
        System.out.println("T2 f2");
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}
class sub extends  T2{

    String a;
    public String c;
    public sub(){
        a="3";
        c="c";
    }
    public void f1(){
        System.out.println("sub f1");
    }
    public void f3(){
        System.out.println("sub f3");
    }
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("a","1");
        m.put("a","2");
        for(String key:m.keySet()){
            System.out.println(m.get(key));
        }
    }
}
