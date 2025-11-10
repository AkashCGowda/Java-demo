class over2{
    public void m1(String s){
        System.out.println("String method");
    }
    public void m1(Object o){
        System.out.println("Object method");

    }
}

public class OverLoad2 {
    public static void main(String [] args){
        over2 b= new over2();
        b.m1("AKASH");
        b.m1(new Object());
        b.m1(null);//when both method type has null values then child class gets more priority than parent
        // if both types are child type example string and string-buffer the value null can be of both types.  then ce: ambiguity error
    }
}
