class Interrupt extends Thread{
    public void run(){
        try {
            for (int i=0;i<10;i++){
                System.out.println("I am lazy thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread got interrupted");
        }
    }
}
public class MT11 {
    public static void main(String [] args){
        Interrupt i = new Interrupt();
        i.start();
        i.interrupt();
        System.out.println("End of main Thread");
    }
}