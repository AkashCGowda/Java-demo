

public class C2 {
static int count =0;
C2(){

}
C2(int x){

}
C2(double d){

}
    {
        count ++;   //Every time new object is created instance block is executed then constructor
    }


    public static void main(String [] args){
    C2 s1 = new C2();
        C2 s2 = new C2(4);
        C2 s3 = new C2(10.00);
        System.out.println("Total Objects: " + count);
    }

}
