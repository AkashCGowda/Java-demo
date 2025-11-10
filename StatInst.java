public class StatInst {
    static int x = 20;
    int y= 30;
    public void instancemethod(){
        System.out.println("Access of instance variable in instance method :" +y);
        System.out.println("Access of static variable  in instance method :" +x);
    }
    public static void staticmethod(){
        // System.out.println("Access of instance variable in static modifier method :" +y);
        // we cannot access the instance variable in static methods
        System.out.println("Access of static variable  in static modifier  method :" +x);
    }

    public static void main(String [] args){
        StatInst a = new StatInst();
        a.x= 444;
        a.y=555;
        StatInst b = new StatInst();
        staticmethod();

        //instancemethod(); Cannot call instance method in static modifier main method.
        // To call instance method dont use the static modifier.

        //Static variable is created once(class level) and re-assigned. This reassigned value will be referenced by new created object
        // Instance variable copy will be created for every new object(object level).

        System.out.println(b.x +"..."+ b.y);
        // o/p b.x=444 as the x is static variable once reassigned this will be referenced for other new created objects.
        //o/p b.y= 30 when the new object is created.new copy of instance variable will be created in the new object.
        // It does not reference the reassigned value of old object unless it is static variable.
    }

}
