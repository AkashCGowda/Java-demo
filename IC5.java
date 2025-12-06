class Popcorn{
    public void taste(){
        System.out.println("Salty");
    }
}

public class IC5 {
    public static void main(String [] args){
        //Anonymous inner class are used for instance uses(one-time use).

        Popcorn p = new Popcorn()    //Anonymous Inner class extends popcorn class
        {
          public void taste(){
              System.out.println("Spicy");
          }
        };
        p.taste();
        System.out.println("The class name is: " + p.getClass().getName()); //IC5$1


        Popcorn p1 = new Popcorn();   //Parent object
        p1.taste();
        System.out.println("The class name is :" +p1.getClass().getName());


        Popcorn p2 = new Popcorn()   //Anonymous Inner class extends Popcorn class
        {
            public void taste()      //Over-riding the taste method
            {
                System.out.println("Sweet");
            }

        };
        p2.taste();
        System.out.println("The class name is :" +p2.getClass().getName());
    }
}