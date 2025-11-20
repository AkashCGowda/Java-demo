class MyThread4 extends Thread{
    public void run(){

    }
}
 public class MT4 {
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getName());  //main
        MyThread4 m4 = new MyThread4();
           System.out.println(m4.getName());      // Thread-0
           Thread.currentThread().setName("Akash");
           System.out.println(Thread.currentThread().getName());   // Name of the Thread:main is changed to Akash
        m4.setName("ABD");
        System.out.println(m4.getName());     // Name of the Thread: Thread-0 is changed to ABD
    }
}