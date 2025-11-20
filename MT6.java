class Priority extends Thread{
    public void run(){
        System.out.println("Child Thread priority is :" +Thread.currentThread().getPriority() );   //Child thread priority inherited from parent thread ie main thread

    }
}

public  class MT6 {
    public  static void main(String [] args){
        Priority p = new Priority();
        p.start();
        System.out.println("The current(main) thread priority by default is :" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);        //priority range is 1-10
        System.out.println("The customised priority of the main thread is:" +Thread.currentThread().getPriority());
    }
}