class ExHandling4{

    public static void main (String [] args){

        System.out.println("Hello");

        try {
            System.out.println(10/0);
        }

        //Multiple catch: when you don't know the exception
        //order of the exception in catch should be Child to Parent type(lower to higher)

        catch (ArithmeticException e){
            System.out.println("Child");

        }
        catch (Exception e){
            System.out.println("Parent");
        }

    }
}
