import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable{
    int num;
    MyCallable(int num){
        this.num=num;
    }
    public Object call() throws Exception{
        System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first" +num + "members");
        int sum =0;
        for(int i=1; i<=num; i++){
            sum = sum+i;
        }
        return sum;
    }

}
public class MTE9 {
    public static void main(String [] args)throws Exception{
        MyCallable [] jobs = {
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60)
        };
        ExecutorService s = Executors.newFixedThreadPool(3);
        for(MyCallable job : jobs){
            Future f= s.submit(job);
            System.out.println(f.get());
        }
        s.shutdown();
    }
}