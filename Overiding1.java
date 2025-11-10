class par{
    public void property(){
        System.out.println("cash");
    }
    public void marry(){
        System.out.println("ABC");
    }
}
class chil extends par{
    public void marry(){
        System.out.println("xyz");
    }
}


public class Overiding1 {
    public static void main(String [] args){
        par p = new par();
        p.marry();

        chil c = new chil();
        c.marry();

        par p1 = new chil();
        p1.marry(); // In over-riding the precedence is given to run time object,
        //Here method resolution takes care by jvm with reference to run time object.

    }
}
