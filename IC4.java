class outer4{
    public void out4(){       //method level inner class or method local inner class
        class inner4{
            public void sum(int x, int y){
                System.out.println("The sum =" +(x+y));
            }
        }
        inner4 i4 = new inner4();
        i4.sum(20,40);
        i4.sum(10,45);
        i4.sum(45,60);
    }
}
public class IC4 {
    public static void main(String [] args){
        outer4 o4 =new outer4();
        o4.out4();
    }
}