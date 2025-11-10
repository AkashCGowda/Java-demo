class ing{
    public void m1(){
        System.out.println("NO-ARG Method");
    }
    public void m1(int i){
        System.out.println("Int-ARG Method");
    }
    public void m1(double d){
        System.out.println("Double-ARG Method");
    }
}


public class OverLoad {
public static void main(String [] args){
    ing a = new ing();
    a.m1();
    a.m1(45.8);
}

}
