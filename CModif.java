package pack1;

//Modifiers for top level classes are public, default, final , abstract and strictfp
//public: can access from outside and inside the current package
//default: can access from current package only
//final: it is applicable for class: cannot extend , methods: cannot override and variables: cannot re-assign

public class CModif {

//Modifiers for inner level classes are private, protected, static and top level class modifiers

    private class inner1 {

    }
    static class inner2{

    }
    public void m1(){
        System.out.println("Hello");
    }
    public static void main(String [] args){
        System.out.println("Class level Modifiers");

    }


}
