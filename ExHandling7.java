class ExHandling7{
    public static void main (String [] args) throws InterruptedException{ //delegates to caller ie jvm

    //To delegate the responsibility of exception handling to the caller
    //caller can be another method or jvm
            //throws does not prevent the abnormal termination of the program at runtime
            //it is used only to convince compiler

        dostuff();
    }
    public static void dostuff()throws  InterruptedException{ //delegates to caller ie main()
        domorestuff();
    }
    public static void domorestuff() throws InterruptedException{ //Delegates to caller ie dostuff()
        Thread.sleep(10000);
    }
}