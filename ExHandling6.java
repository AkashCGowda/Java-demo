class ExHandling6 extends RuntimeException{       // throw keyword is used only for Throwable types
    static  String msg;
    ExHandling6(String msg){
        this.msg = msg;
    }
    public static void main(String [] args){
            throw new ExHandling6("Customised Exception");     //Customised exception object created


    }

}