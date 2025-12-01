public class MTE10 {
    public static void main(String [] args){

        ThreadLocal l = new ThreadLocal()
        {
            public Object initialValue()
            {
                return "abc";
            }
        };
        System.out.println(l.get());
        l.set("Akash");
        System.out.println(l.get());
        l.remove();
        System.out.println(l.get());
    }
}