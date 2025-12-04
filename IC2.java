public  class IC2 {
    class inner2{
        public void in2(){
            System.out.println("Inner class");
        }
    }
    public void outer2(){
        inner2 i =new inner2();
        i.in2();
    }
    public  static void main(String  [] args){ //Acessing inner class method from instance area.
        IC2 o = new IC2();
        o.outer2();
    }
}