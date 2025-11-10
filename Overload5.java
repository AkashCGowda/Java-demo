class Animal{

}
class Monkey extends Animal{

}
    class Overload5{

    public void m1(Animal a){
        System.out.println("Animal version");
    }
    public void m1(Monkey m) {
        System.out.println("Monkey version");

    }
        public static void main (String[]args){
         Overload5 t = new Overload5();
          Animal a= new Animal();
          Monkey m = new Monkey();
          t.m1(a);
          t.m1(m);
          Animal a1 = new Monkey();//Parent reference child object
            t.m1(a1);//Priority of precedence is given to reference type

        }
    }
