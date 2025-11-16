
class TooYoungException extends RuntimeException{   //customised exception

    TooYoungException(String msg){
        super(msg); // to make description available to default exception handler
    }
}

class TooOldException extends RuntimeException{    //customised exception
    TooOldException(String msg){
        super(msg);
    }
}
class ExHandling8 {
    public static void main(String [] args){
        int age = Integer.parseInt(args[0]);
        if (age>60){
            throw new TooYoungException("Plz wait for some more time");
        }
        else if (age<18){
            throw new TooOldException("Your age is passed the marriage stage");

        }
        else{
            System.out.println("Matches will be found soon");
        }
    }
}