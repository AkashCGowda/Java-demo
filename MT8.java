class YieldDemo extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
            Thread.yield();   //yield(): It pauses the current thread. so that other thread executes.
                              // when yield() is implemented to current working thread to goes into runnable stage. waiting for thread scheduler to alocates the processor.
                               // if the priority of the other thread are same
            // If there are more threads waiting with same priority then thread scheduler alocates the processor based on its internal algorithm
        }


    }
}
public class MT8 {
    public static void main(String [] args){
        YieldDemo y = new YieldDemo();
        y.start();
        for (int i=0;i<10; i++){
            System.out.println("Main Thread");
        }
    }
}