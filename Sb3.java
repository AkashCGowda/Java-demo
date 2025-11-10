public class Sb3 extends StatExecution {
    static int z= 600;
    static {
        m2();
        System.out.println("First static block of Child");
    }
    public static void main(String [] args){
        m2();
        System.out.println("Child Main method");
    }
    public static void m2(){
        System.out.println(c);
    }
    static {
        System.out.println("Second static block of Child");
    }
    static int c= 350;
}
// order of execution
// when running child class
// Identification of static members from start to bottom(From Parent to Child) coz Parent members available to child
//Execution of static variables assignment and static blocks from top to bottom
//Execution of main method of child