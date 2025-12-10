public class JLP1 {
    String name;
    int rollnumb;
    JLP1(String name, int rollnumb)
    {
        this.name =name;
        this.rollnumb = rollnumb;
    }
    public static void main(String [] args)
    {
        JLP1 s1 = new JLP1("Akash", 101);
        JLP1 s2 = new JLP1("ABD", 102);
        System.out.println(s1);  //object class toString() got executed internally.
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}