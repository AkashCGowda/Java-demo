class ChildJoin extends Thread{
    static Thread mt;        //To initialise the variable to main thread. so the reference is used in child.
    public void run(){
        try {
            mt.join();       // reference of parent thread
        }catch (InterruptedException e){
    }
        for (int i=0; i<10; i++){
            System.out.println("Wait till the main Thread execution and then join the Child Thread");
        }
    }
}

public class MT10 {
    public static void main(String [] args){

        ChildJoin.mt = Thread.currentThread();    //Initialising the main thread to child static variable
        ChildJoin c = new ChildJoin();
        c.start();
         for(int i=0; i<10; i++) {
             System.out.println("Main Thread");
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
             }
         }

    }
}