public class JLP2 {             //Over-riding tostring() method of object class
    String name;
    int rollnumb;
    JLP2(String name, int rollnumb)
    {
        this.name =name;
        this.rollnumb = rollnumb;
    }
    public String toString()
    {
        return name + "......"+ rollnumb;
    }
    public static void main(String [] args)
    {
        JLP2 s1 = new JLP2("Akash", 101);
        JLP2 s2 = new JLP2("ABD", 102);

        System.out.println(s1);        // toString() got executed internally.
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}