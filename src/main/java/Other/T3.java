package Other;

public class T3 {
    static ThreadLocal<Integer> i=new ThreadLocal<>();
    public void thread1(){
        i.set(1);
    }
    public void thread2(){
        i.set(100);
    }
    public void f(int k){
        int x;
        if(k==1){
            x=1;
        }else{
            x=10001;
        }
        for(int j=1;j<=10000;j++){
            System.out.println(Thread.currentThread().getName()+" "+(x++));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        T3 t3=new T3();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                t3.f(1);
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                t3.f(2);
            }
        });
        t1.start();
        Thread.sleep(1);
        t2.start();
    }
}
