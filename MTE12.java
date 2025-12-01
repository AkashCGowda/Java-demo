class PThread extends  Thread{
    public static InheritableThreadLocal t1 = new InheritableThreadLocal()
    {
        public Object childValue(Object p){
            return "cc";
        }
    };
    public void run(){
        t1.set("pp");
        System.out.println("Parent Thread Value --" + t1.get());
        CThread ct = new CThread();
        ct.start();


    }
}

class CThread extends Thread{
    public void run(){
        System.out.println("Child Thread Value---"+ PThread.t1.get());
    }
}

public class MTE12 {
    public static void main(String [] args){
        PThread pt = new PThread();
        pt.start();
    }
}