class displayF{
    public synchronized void displayn(){
        for (int i=0; i<10; i++){
            System.out.print(i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
    public synchronized void displayc(){
        for(int i=65; i<75; i++){
            System.out.print((char) i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}
class  Sync1 extends Thread{
    displayF d;
    Sync1(displayF d){
        this.d=d;
    }
    public void run(){
        d.displayn();
    }
}

class  Sync2 extends Thread{
    displayF d;
    Sync2(displayF d){
        this.d= d;
    }
    public void run(){
        d.displayc();
    }
}

public class MT13 {
    public static void main(String [] args){
        displayF  d1 = new displayF();
        Sync1 s1 = new Sync1(d1);
        Sync2 s2 = new Sync2(d1);
        s1.start();
        s2.start();
    }
}