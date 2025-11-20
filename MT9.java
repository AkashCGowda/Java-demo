class JoinDemo extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
            try {
                Thread.sleep(2000);    //The thread sleep for 2000 ms before execution.
            } catch (InterruptedException e) {

            }
        }
    }
}
public class MT9 {
    public static void main (String [] args){
        JoinDemo j = new JoinDemo();
        j.start();
        try {                //Has to be written in try catch or throws because there is a chance of Thread interruptions
            j.join();           //Join(): keeps the thread at waiting state until the completion of the joining thread ie j in this program. then it executes after it.
        }catch (InterruptedException e){

        }
        for (int i=0; i<10; i++){
            System.out.println("Whats up");
        }
    }
}
