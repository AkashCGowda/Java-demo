 interface Outer
 {
     public void m1();
     interface inner
     {
         public void m2();
     }
}

class Out10 implements Outer
{
    public void m1()
    {
        System.out.println("Outer Interface method Implementation ");
    }
}

class in10 implements   Outer.inner
{
    public void m2()
    {
        System.out.println("Inner interface method implementation ");
    }
}

public class IC10
{
    public static void main(String [] args)
    {
        Out10 o = new Out10();
        o.m1();
        in10 i = new in10();
        i.m2();
    }
}