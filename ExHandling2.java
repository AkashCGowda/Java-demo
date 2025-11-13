class ExHandling2{

    public static void main (String [] args){

        System.out.println("Hello");
                try {
                    System.out.println(10/0);   // Risky code in risky block(which may raise exception)
                }
                catch (ArithmeticException e){
                    System.out.println(10/2);    // Alternative or handling block
                }

        System.out.println("Normal Termination");
    }
}