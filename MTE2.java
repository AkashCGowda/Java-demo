public class MTE2 {
    public static void main(String [] args){
        ThreadGroup tg1 = new ThreadGroup("Threaddemo");  //default priority of ThreadGroup is 10
        Thread t1 = new Thread(tg1,"Thread1");    //default priority of thread is 5
        Thread t2 = new Thread(tg1, "Thread2");
        tg1.setMaxPriority(3); //set the priority of thread group to 3

        Thread t3 = new Thread(tg1,"Thread3"); // The priority is set by ThreadGroup
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        //the threads which are created before seting the threadgroup priority are unchanged
    }
}
