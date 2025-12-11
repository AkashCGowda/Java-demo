public class JLP5              //equals(): object  Reference or adress comparison. not object data(content) comparison.
{
    String name;
    int rollnumb;
    JLP5(String name, int rollnumb)
    {
        this.name=name;
        this.rollnumb = rollnumb;
    }
    public static void main(String [] args)
    {
        JLP5 j1 = new JLP5("Akash",101);
        JLP5 j2 = new JLP5("ABD", 102);
        JLP5 j3 = new JLP5("Akash", 101);
        JLP5 j4 = j1;

        System.out.println(j1.equals(j2));
        System.out.println(j1.equals(j3));
        System.out.println(j1.equals(j4)); //true as the j4 and j1 pointing to same object with same hash code.

        System.out.println(j1.hashCode());
        System.out.println(j4.hashCode());
    }
}