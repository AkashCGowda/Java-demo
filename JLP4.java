public class JLP4   {
    int i;
    JLP4(int i)
    {
        this.i = i;
    }
    public int hashCode()           //Over-riding hashCode()
    {
        return i;
    }
    public static void main(String [] args)
    {
        JLP4 a1 = new JLP4(10);
        JLP4 a2 = new JLP4(20);
        System.out.println(a1); //classname +@ +hexadecimal(i)
        System.out.println(a2);
    }
}