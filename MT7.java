class Priority2 extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}

public class MT7 {
    public static void main(String [] args){
        Priority2 p2 = new Priority2();
        p2.setPriority(10);
        p2.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");

            //o/p: Child Thread is executed first as main thread priority is default ie 5 while child threads is 10
        }
    }
}