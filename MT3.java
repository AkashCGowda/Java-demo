class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
         System.out.println("Child_Thread");
}

}}
public class MT3{
    public static void main(String [] args){
         MyRunnable r = new MyRunnable();    //MyRunnable: child class of interface Runnable. It does not have start().
         Thread t3= new Thread(r);      //Therefore new Thread class object is created with reference of Inbuilt Thread class
        t3.start();                    // That new Thread object created. Its argument is target element.Here the target element is r.
        //now the start() is referenced by Thread element t3. Which target the MyRunnable class to start with new thread.
    for (int i=0; i<10; i++){
       System.out.println("Main_Thread");

}}}
