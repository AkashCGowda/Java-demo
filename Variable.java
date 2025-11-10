class p{
   int x=444;
}
class c extends p{
   int x=888;
}



public class Variable {
   public static void main(String [] args){
      p p1 = new p();
     System.out.println( p1.x);

     c c1 = new c();
     System.out.println(c1.x);

     p p2 = new c();         // Over-riding is not available for variables
     System.out.println(p2.x);
     // variable resolution is taken care by compiler based on reference type similar to over-loading.
      // The output remains same with static non-static variables, any combination for static-instance variables also.
   }
}
