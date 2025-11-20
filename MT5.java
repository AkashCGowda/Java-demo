class MyThread5 extends Thread{
    public void  run(){
        System.out.println("run() executed by Thread:" + Thread.currentThread().getName());
    }
}

public class MT5{
    public static void main (String [] args){
        MyThread5 t5 = new MyThread5();
        t5.start();
        System.out.println("Main method is executed by Thread:" + Thread.currentThread().getName());
    }
}