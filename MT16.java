class DamonThread extends Thread{



}

public class MT16 {
    public static void main(String [] args){
        System.out.println(Thread.currentThread().isDaemon()); // Checks the main thread is demon or non demon
       // Thread.currentThread().setDaemon(true);   //Main thread cannot be set to daemon
        //coz the main thread is already started by jvm and is not in the scope of programmer
        DamonThread d1 = new DamonThread();

        System.out.println(d1.isDaemon());  //By default the thread daemon or non-daemon will be inherited from main thread
        d1.setDaemon(true);  //New thread before starting is set to daemon

       System.out.println(d1.isDaemon());

    }
}