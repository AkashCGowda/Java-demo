class Threaddemo3 extends Thread {
    Threaddemo3(ThreadGroup g, String name) {
        super(g, name);
    }

    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
public class MTE3 {
    public static void main(String [] args){
        ThreadGroup pg = new ThreadGroup("ParentGroup");
        ThreadGroup cg =new ThreadGroup(pg, "ChildGroup"); //Threadgroup cg created inside Threadgroup pg
        Threaddemo3 t1 = new Threaddemo3(pg,"Thread1"); // thread1 created inside pg
        Threaddemo3 t2 = new Threaddemo3(pg, "Thread2"); //thread2 created inside pg
        t1.start();
        t2.start();
        System.out.println(pg.activeCount()); //active thread count in pg threadgroup
        System.out.println(pg.activeGroupCount()); //active threadgroup count in pg threadgroup
        pg.list();
    }
}