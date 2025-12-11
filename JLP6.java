import com.sun.xml.internal.bind.v2.runtime.reflect.opt.MethodAccessor_Integer;

import java.lang.reflect.Method;

public class JLP6
{
    public static void main(String [] args)
    {
        int count = 0;
        String s = new String("Akash");
        Object o = s;
        Class c = o.getClass();  //getClass() is Object method.
        System.out.println("Fully qualified name of class:" + c.getName());
        Method [] m = c.getDeclaredMethods();
        System.out.println("Methods Information :");
        for (Method m1:m)
        {
            count ++;
            System.out.println(m1.getName());

        }
        System.out.println("The total number of methods present in " +c + " is :" +count );
    }
}