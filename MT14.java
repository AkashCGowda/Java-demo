public class MT14
{
    public static void main(String [] args) throws InterruptedException
    {
        IntraTreddingCommunication ITC = new IntraTreddingCommunication();
        ITC.start();
        synchronized (ITC)     //Synchronised block with argument ITC object
        {
            System.out.println("Main thread trying to call wait method");


            ITC.wait();      // Main thread releases the lock of the ITC object and enters into waiting state.

            System.out.println("Main thread received the notification");
            System.out.println(ITC.total);  //The main thread receives the lock of the ITC object after receiving the notify() and updates the final value.

        }
    }
}



class IntraTreddingCommunication extends Thread{
    int total = 0;
    public void run()
    {
        synchronized (this)
        {
        System.out.println("Child thread starts calculation");
        for (int i=1; i<=100; i++)
        {
            total= total + i;
        }
        System.out.println("Child thread giving notification call");
        this.notify();    //notify the main thread and child thread releases the lock of the object

        }
    }
}