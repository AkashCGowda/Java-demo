class StatExecution{
    static int x= 445;
    static {
        m1();
        System.out.println("First static block");
    }
    public static void main(String [] args){
        m1();
        System.out.println("Main method");
    }
    public static void m1(){
        System.out.println(j);
    }
    static {
        System.out.println("Second static block");
    }
    static int j= 850;
}
//Execution order in static members
// Identification of static members from start to bottom
//Execution of static variables assignment and static blocks from top to bottom
//Execution of main method

