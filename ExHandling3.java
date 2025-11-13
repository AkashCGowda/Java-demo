class ExHandling3{

        public static void main (String [] args){

            System.out.println("Hello");
            try {
                System.out.println(10/0);
            }
            catch (ArithmeticException e){

                //Methods to print exception information or error information
                //These Methods present in throwable class

                e.printStackTrace();

               // System.out.println(e.toString());

               // System.out.println(e.getMessage());
            }

            System.out.println("Normal Termination");
        }
    }
