import java.util.concurrent.locks.*;

class DisplayLock{
       ReentrantLock l = new ReentrantLock();
    public  void wishl(String name){
             l.lock();
        for(int i=0; i<10; i++){
            System.out.print("Good Morning :");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            System.out.println(name);
        }
        l.unlock();
    }
}

class MyThreadL extends  Thread{
    DisplayLock d;
    String name;
    MyThreadL(DisplayLock d, String name){
        this.d = d;
        this.name =name;

    }
    public void run(){
        d.wishl(name);
    }
}

public class MTE6 {

public static void main(String [] args){
    DisplayLock d = new DisplayLock();
    MyThreadL t1 = new MyThreadL(d, "ABD");
    MyThreadL t2= new MyThreadL(d,"Starc");
    t1.start();
    t2.start();
}

}