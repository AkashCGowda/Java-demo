class Display{
    public synchronized void wish(String name){  //synchronized method allows multi-thread operation on single object to execute one thread at a time.
        for(int i=0; i<10; i++) {                //using internal object level lock system. until one thread execution complete other thread will be in waiting stage.
            System.out.print("Good Morning :");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e) {
            }
            System.out.println(name);
            }
        }

    }
class Doubledisplay extends Thread{
    Display d;
    String name;
    Doubledisplay(Display d, String name){
        this.d =d;
        this.name=name;
    }
    public void run(){

        d.wish(name);
    }
}
public class MT12 {
    public static void main(String [] args){
        Display d = new Display();
        Doubledisplay t1 = new Doubledisplay(d,"ABD");
        Doubledisplay t2 = new Doubledisplay(d,"Gayle");
        Doubledisplay t3 = new Doubledisplay(d,"Starc");
        t1.start();
        t2.start();
        t3.start();

    }
}