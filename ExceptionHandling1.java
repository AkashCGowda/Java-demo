import java.io.*;

class ExceptionHandling1{

public  static void main(String [] args) throws FileNotFoundException
    {
        PrintWriter p = new PrintWriter("ABC.txt"); //There might be chance of File not Found, so compiler at run time says to handle if the file is not found to execute the code smoothly.

    //checked exception: The exception which are checked by the compiler for smooth execution of the code at runtime.
    //unchecked-exception:The exceptions which not  checked by compiler.weather programmer handling or not.
        System.out.println(10/0); //Example of unchecked exception
    p.println("Hello");
}

}