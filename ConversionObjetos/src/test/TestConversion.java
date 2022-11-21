package test;

import domain.*;

public class TestConversion {

    public static void main(String[] args) {
        Empleado empleado = new Escritor("Juan", 5000.0, TipoEscritura.CLASICO);//upcasting

        //downcasting; clase padre a clase hija
        System.out.println(((Escritor) empleado).getTipoEscritura());//downcasting

        Escritor escritor = (Escritor) empleado;
        //upcasting clase hija a padre, sin necesidad de conversion explicita
       
        Empleado empleado2 = escritor;
        System.out.println(empleado.getClass().getSimpleName());
        System.out.println(empleado2.obtenerDetalles());

    }

}
