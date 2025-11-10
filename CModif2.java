package pack2;

import pack1.CModif;
// importing CModif class access by public

public class CModif2 {
    public static void main(String [] args){
        CModif a = new CModif();
        // m1 method is accessed from pack1.CModif
        a.m1();
    }
}
