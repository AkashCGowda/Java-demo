import java.util.concurrent.locks.*;
class MyThreadl1 extends Thread{
    static ReentrantLock l =new ReentrantLock();
    MyThreadl1(String name){
        super(name);
    }
    public  void run(){
        if (l.tryLock()){
            System.out.println(Thread.currentThread().getName() +":  Got the lock and performing the task below");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            l.unlock();
        }else {
            System.out.println(Thread.currentThread().getName() + ":  Unable to get the lock so performing the alternative operation");

        }

    }
}
public class MTE7 {
    public static void main(String [] args){
        MyThreadl1 t1 = new MyThreadl1("Thread 1");
        MyThreadl1 t2 = new MyThreadl1("Thread 2");
        t1.start();
        t2.start();
    }
}