class parent1{
    public static void m1(){
        System.out.println("Parent method");
    }
}
class child1 extends parent1{
    public static void m1(){
        System.out.println("Child method");
    }
}

public class MethodHiding1 {
    public static void main(String [] args){
        parent1 p = new parent1();
        p.m1();

        child1 c = new child1();
        c.m1();

        parent1 p1 = new child1();
        p1.m1(); // Method resolution takes care by compiler based on reference type, and executes parent method hence not over-riding.
    }
}
