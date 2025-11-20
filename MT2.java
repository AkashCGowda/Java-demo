import javax.swing.table.TableRowSorter;

class MyThread2 extends Thread {
    public void run(){                           //overloading in Threads

            System.out.println("NO-Arg-run_method");   //start() always invokes NO-Args-run()

    }
    public void run(int x){
        System.out.println("Int-Arg_run_method");    //should invoke by normal method call
    }
}

public class MT2{
    public static void main(String[] args) {
       MyThread2 t2 = new MyThread2();
        t2.start();                          //start() internally invokes run()
    }
}