class outer3 {
    int x= 10;
    static  int y= 5;
    class inner3 {
        int x = 10000;
        public void in3() {
            int x=1;
            System.out.println(x);
            System.out.println(y);
            System.out.println(this.x);
            System.out.println(outer3.this.x);
            System.out.println("Inner class");
        }
    }
}
public class IC3 {         // Accessing inner class method from outside outer class.
    public static void main(String [] args){
        outer3 o = new outer3();
        outer3.inner3 i = o.new inner3();
        i.in3();
    }
}