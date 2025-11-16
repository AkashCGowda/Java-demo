

class ExHandling9{
    public  static void main(String [] args){

        try {
           //
            // System.out.println(10/0);
            String s= null;
            System.out.println(s.length());

        }
        catch (ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e){   //Multiple catch exception
            e.printStackTrace();         //while writing multiple exception in single catch,the exceptions should not be related ie parent and child
        }                               //  also the handling code should be same
    }
}