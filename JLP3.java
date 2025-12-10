import  java.util.*;
public class JLP3 {       //wrapper class already over-ridden toString()

   public String toString()
   {
       return  "JLP3";
   }
    


    public static void main(String [] args)
    {
        // wrapper class
                Integer i = new Integer(10);
                ArrayList l = new ArrayList();
                l.add("A");
                l.add("B");

         //customised class
        JLP3 j = new JLP3();  //If toString() is not over-ridden then Object class toString() will be executed interally
                

        System.out.println( i);  //object class toString() got executed internally.
        System.out.println(l);
        System.out.println(j);
    }
}