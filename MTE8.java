import java.util.concurrent.*;
class PrintJob implements Runnable{

    String name;
    PrintJob(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name +"...Job started by Thread:" +Thread.currentThread().getName());
        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){

        }
        System.out.println(name + ".....Job completed by Thread:" +Thread.currentThread().getName());
    }

}


public class MTE8 {
    public static void main(String [] args){
        PrintJob[] jobs= {
                new PrintJob("Sehwag"),
                new PrintJob("Gayle"),
                new PrintJob("ABD"),
                new PrintJob("Butler"),
                new PrintJob("SuryaKumar_Yadav"),
                new PrintJob("Narine")
        } ;
        ExecutorService s = Executors.newFixedThreadPool(3);
        for (PrintJob i:jobs)
        {
            s.submit(i);
        }
        s.shutdown();
    }
}