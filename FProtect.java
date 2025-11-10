package pack5;
import pack4.Protect;
public class FProtect extends Protect {
    public static void main(String [] args){
        //Protected member only can be accessed by child member : outside package: with child object reference only
        FProtect a =new FProtect();
        a.m1();
    }
}
