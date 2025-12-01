class CustomerThread extends Thread{
    static Integer CustID=0;
    private static ThreadLocal t1 = new ThreadLocal()
    {
        protected Integer initialValue()
        {
            return ++CustID;
        }

    };

    CustomerThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " executing with customer ID :" + t1.get());
    }
}

public class MTE11 {
    public static void main(String [] args){
        CustomerThread c1 = new CustomerThread("Customer Thread_1");
        CustomerThread c2 = new CustomerThread("Customer Thread_2");
        CustomerThread c3 = new CustomerThread("Customer Thread_3");
        CustomerThread c4 = new CustomerThread("Customer Thread_4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}