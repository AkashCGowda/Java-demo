class overl1{
    public void m1(int l){
        System.out.println("Int-Arg method");
    }
    public void m1(float f){
        System.out.println("Float-ARG method");
    }
}


public class Overload1 {
    public static void main(String [] args){
        overl1 a = new overl1();
        a.m1(45);
        a.m1(45.5f);
        a.m1('a');// If argument type doest match then next level argument type executes
        a.m1(66l);// long type argument is not declared so the next level argument float type gets executed
        //a.m1(10.5); //double next level is not available
    }
}
