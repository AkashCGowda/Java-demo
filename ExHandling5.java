class ExHandling5{
    public static void main(String [] args){
        throw new ArithmeticException("disvision by 0");
        //throw keyword handover the created exception object to the jvm manually
        //without throw keyword sop(10/0), the same process occurs, but internally.
        //Best used in user defined exception or customised exception
    }
}