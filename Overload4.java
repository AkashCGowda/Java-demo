class  over4{
    public void m1(int x){
        System.out.println("General method");
    }
    public void m1(int...x){
        System.out.println("VAR-ARG Method");
    }
}


public class Overload4 {
    public static void main(String [] args ){
        over4 a = new over4();
        a.m1();
        a.m1(44); //General method is given more priority than Var-arg method
        a.m1(4,5,55);
    }
}
