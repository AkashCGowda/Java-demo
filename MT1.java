class MyThread extends Thread {
    public void run(){
        for(int i=0; i<10; i++){             //Body of run method is called Job
        System.out.println("Child Thread");
         }
    }
}

 public class MT1 {
     public static void main(String[] args) {     //Main Thread : It executes main method and starts child thread
         MyThread t1 = new MyThread();            //child thread instantiated
         t1.start();                              //child thread started
         for (int i = 0; i < 10; i++) {
             System.out.println("Main_Thread");

             //Thread Scheduler: It is a part of jvm, it is responsible to schedule threads ie if multiple threads
             // are waiting to get a chance of execution then in which order threads will be executed is decided by thread scheduler.
         }

     }
 }