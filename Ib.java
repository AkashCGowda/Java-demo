public class Ib {
    int x =345;
    {
        m1();
        System.out.println("First Instance Block");
    }
    Ib(){
        System.out.println("Constructor");
    }
    public static void main(String [] args ){  //static member
        Ib b = new Ib(); // Without object creation  instance block execution is not possible
        System.out.println("Main method");

    }
    public void m1(){
        System.out.println(j);
    }
    {
        System.out.println("Second instance block");
    }
    int j =845;

}
// order of execution
// Identification of Static members from top to bottom
// static block execution and static variable assignment
// Execution of main method


// Instance block execution : object creation is necessary to execute instance block
// Every new object created follows the same order
// Identification of the instance members from top to bottom
// Execution of instance variable assignment and instance blocks from top to bottom
// Execution of constructor
