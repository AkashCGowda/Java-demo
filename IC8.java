public class IC8 {
    public static class nested    //Static nested class
    {
        public void m1()
        {
            System.out.println("Static nested class");
        }
    }
    public static void main(String [] args)
    {
        nested n = new nested();  //NO need to create outer class object
        n.m1();
    }
}