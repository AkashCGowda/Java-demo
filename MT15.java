class DeadLockA{

    public synchronized void dla(DeadLockB b)
    {
        System.out.println("Thread 1 enters dla()");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        System.out.println("Thread 1 trying to call dlb class last()");
        b.last();

    }
    public  synchronized void last()
    {
        System.out.println("The thread enters DeadLockA class last()");
    }
}

class DeadLockB{
    public synchronized void dlb(DeadLockA a){
        System.out.println("Thread 2 enters dlb()");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
        }
        System.out.println("Thread 2 trying to call dla class last()");
        a.last();

    }
    public synchronized void last()
    {
        System.out.println("The thread enters DeadLockB class last()");
    }
}

public class MT15 extends Thread{
    DeadLockA a = new DeadLockA();
    DeadLockB b = new DeadLockB();
    public void mt15(){
        this.start();  //new thread created and jumps to run()
        a.dla(b);      //this line executed by main thread
    }
    public void run(){
        b.dlb(a);   //This line executed by child thread

    }
    public static void main (String [] args){
        MT15 m = new MT15();
        m.mt15();
    }
}