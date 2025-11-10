import java.io.*;

class p1{
    p1() throws IOException
    {

    }
}

public class C5Exhand extends p1 {
    C5Exhand() throws IOException, Throwable{     // If parent class constructor throws IOException(checked)
                                                  // compulsory child constructor should throw IOException or its parent
                                                  //compiler generates default constructor
    }
}
