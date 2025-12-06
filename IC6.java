public class IC6 {
    public static void main(String [] args) {
        Thread t1 = new Thread()   //Anonymous inner class with respect to thread.
        {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Innner_classs Child Thread");
                }
            }
        };
        t1.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }

}