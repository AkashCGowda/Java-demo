class parent{
    public void m1(){
        System.out.println("Parent");
    }
}

class child extends parent{
    public void m2(){
        System.out.println("Child");
    }

}



public class Inherit1 {
    public  static void main(String[] args){

        //parent reference parent object
        parent p = new parent();
        p.m1();
        // p.m2(); parent object cannot call child method


        //Child reference child object
        child c= new child();
        c.m2();
        c.m1();


        //parent reference child object
        parent p2= new child();
        p2.m1();
        //p2.m2(); cannot call child method in parent reference child object


        //child reference parent object
        //child c2= new parent(); cannot create parent object with child reference

    }
}
