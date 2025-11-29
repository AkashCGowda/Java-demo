import java.util.concurrent.locks.*;


public class MTE5 {
    public static void main(String [] args){
     ReentrantLock l = new ReentrantLock();  //pre-built class. child class of object.
     l.lock();
     l.lock();
     System.out.println(l.isLocked());       //Methods present in ReentrantLock class(implementation class of interface locks)
        System.out.println(l.isHeldByCurrentThread());
        System.out.println(l.getQueueLength());
        l.unlock();
        System.out.println(l.getHoldCount());
        System.out.println(l.isLocked());
        l.unlock();
        System.out.println(l.isLocked());
        System.out.println(l.isFair());

    }
}