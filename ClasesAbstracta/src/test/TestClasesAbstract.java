package test;

import domain.*;

public class TestClasesAbstract {
    public static void main(String[] args) {
        //FiguraGeometrica fg = new FiguraGeometrica();//no se crean objetos de las clases abstractas
    
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
