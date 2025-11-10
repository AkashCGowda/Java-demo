public class  Ib2 extends Ib {
        int y =125;
        {
            m2();
            System.out.println("Child Instance Block 1");
        }
        Ib2(){
            System.out.println("Child Constructor");
        }
        public static void main(String [] args ){  //static member
            Ib2 b = new Ib2(); // Without object creation  instance block execution is not possible
            System.out.println("Child Main method");

        }
        public void m2(){
            System.out.println(k);
        }
        {
            System.out.println("Child Second instance block");
        }
        int k =245;

    }
// order of execution
// Identification of Static members from top to bottom
// static block execution and static variable assignment
// Execution of main method of child


// Instance block execution : object creation is necessary to execute instance block
// Every new object created follows the same order
// Identification of the instance members from top to bottom(Parent to child)
// Execution of instance variable assignment and instance blocks in only parent class from top to bottom
// Execution of parent constructor
// Execution of instance variable assignment and instance blocks in only child class from top to bottom
// Execution of  child constructor
