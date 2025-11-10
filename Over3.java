class overl3{
    public void m1(int x, float f){
        System.out.println("INT-FLOAT method");

    }
    public void m1(float f, int x){
        System.out.println("FLOAT-INT method");
    }
}


public class Over3 {
    public static void main(String[] args) {
        overl3 l3 = new overl3();
        l3.m1(45,55.6f );
        l3.m1(66.5f,45);
        //l3.m1(44,44); CE: Ambiguity problem
    }
}
