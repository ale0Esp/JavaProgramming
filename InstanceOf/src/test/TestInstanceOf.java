package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 1000, "Contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es tipo gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Tipo object");
        }
    }

}
