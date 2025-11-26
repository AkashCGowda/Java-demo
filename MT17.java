class DeamonThread2 extends Thread{
    public void run(){
        System.out.println("The child thread is daemon:" + Thread.currentThread().isDaemon());
        for(int i=0; i< 10; i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}
public class MT17 {
    public  static  void  main(String [] args){
        DeamonThread2 d2 = new DeamonThread2();
        d2.setDaemon(true);
        d2.start();

        System.out.println("Exit of main Thread");

        //once the main thread(Last non-daemon thread) execution completes the deamon thread is dead.
        //The child thread(if Daemon) executes the code until the main thread(last non-daemon thread) completes.
        //The Daemon thread objective is to give support to non-daemon threads like main thread.
    }
}