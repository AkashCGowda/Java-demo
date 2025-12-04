public class IC1 {

    class inner{     //No static members are alowed
        public void m1(){
       System.out.println("Inner class");
    } }
    public static void main(String [] args){  //Accessing inner class from static area of outer class

        IC1 o = new IC1();      //To call inner class outer class object should exist
        IC1.inner i = o.new inner();  //inner class object should be created by outer class reference.
        i.m1();     //to call inner class method inner class object should exist.
    }
}