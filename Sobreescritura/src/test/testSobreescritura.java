package test;

import domain.*;

public class testSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan",5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        Gerente gerente = new Gerente("Karla",1000,"Contabilidad");
       // System.out.println("gerente = " + gerente.obtenerDetalles());
       imprimir(gerente);
    }
    //polimorfimo: multiples comportamientos dependiendo al tipo apuntado
    //ejecuta el metodo en base la referencia de donde se creo el objeto
    public static void imprimir(Empleado empleado){//se define una variable de clase padre
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
}
