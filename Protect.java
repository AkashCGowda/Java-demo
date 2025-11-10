package pack4;

public class Protect {
    protected void m1(){
        System.out.println("The protected modifiers capability check");
    }
}
class Protect2 extends Protect {
    public static void main(String[] args) {
        // Protected modifier can be accessed by child members
    Protect a = new Protect();
    a.m1();
    Protect2 b= new Protect2();
    b.m1();
    Protect c= new Protect2();
    c.m1();
}
}
final class Protect3{
    // final modifier not allows to generate child classes
    public static void main(){
        // Protected member can be accessed from other classes from same package under protected member class reference
        Protect c = new Protect();
        c.m1();
        System.out.println("child3");
    }
}
