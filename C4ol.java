

class overload1c{
    overload1c(){
       this(10);
        System.out.println("NO-ARG constructor");
    }
    overload1c(int x){
        this(10.5);
        System.out.println("INT-ARG constructor");
    }
    overload1c(double d){
        System.out.println("Double-ARG method");
    }
}


public class C4ol {
    public static void main(String [] args){
        overload1c l1 = new overload1c();
       overload1c l2 = new overload1c(50);
        overload1c l3 = new overload1c(4.55);
        overload1c l4 = new overload1c(4666l); // long type not available so it executes next level double
    }
}
