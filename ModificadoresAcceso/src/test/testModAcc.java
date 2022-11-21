package test;

import paquete1.*;
import paquete2.*;

public class testModAcc {
    public static void main(String[] args) {
        
        Clase1 clase1 = new Clase1("publico");
        ClaseHija classChild = new ClaseHija();
        System.out.println("classChild = " + classChild);
       // Clase2 clase2 = new Clase2; //no accesa a clase2
        //clase2.atribDfault="cambio";
        //System.out.println("atribDfault = " +clase2.atribDfault);
        //clase2.metodo();
          ClaseHijaPrivate cHJ = new ClaseHijaPrivate();
    }
    
}
