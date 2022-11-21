package test;

import domain.*;
import genericos.ClaseGenerica;

public class Test {
    
    public static void main(String[] args) {
        Producto refresco = new Bebida("cabrito",30,1.5,"tuti fruti");
        Producto papas = new Frituras("naturales", 15, 32);
        ClaseGenerica<Producto> cg = new ClaseGenerica<>();
        cg.addProducto(refresco);
        cg.addProducto(papas);
        System.out.println(cg.getList());
    }
    
    
}
