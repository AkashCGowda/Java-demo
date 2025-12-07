interface combination
{
    public int getnoofwheels();
    class defaultimp implements combination
    {
        public int getnoofwheels()
        {
            return 2;
        }
    }

}

class customisedimp implements combination
{
    public int getnoofwheels()
    {
        return 6;
    }
}

public class IC11 {
    public static void main(String [] args)
    {
        combination.defaultimp d = new combination.defaultimp();
       System.out.println( d.getnoofwheels());
        customisedimp c = new customisedimp();
        System.out.println(c.getnoofwheels());
    }
}