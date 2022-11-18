package test;

import domain.*;

public class testClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Valeria", 5000);
        Empleado escritor1 = new Escritor("daniel",2520,TipoEscritura.CLASICO);
        Empleado escritor2 = new Escritor("Sonia",2520,TipoEscritura.MODERNO);
        Empleado gerente1 = new Gerente("Jose", 5200,"homedepas");
        Empleado gerente2 = new Gerente("Julia", 5200,"depaBuilds");
        ifs(empleado1,empleado2);
        ifs(escritor1,escritor2);
        ifs(empleado1,escritor2);
        ifs(gerente1,gerente2);
        ifs(gerente1,escritor1);
    }
    
    public static void ifs(Empleado emp1, Empleado emp2 ){
        System.out.println("diferenciando clases entre tipo "
                +emp1.getClass().getSimpleName() + " y " + emp2.getClass().getSimpleName());
        if (emp1 == emp2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Distinta referencia memoria");
        }
        if (emp1.equals(emp2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        if (emp1.hashCode() == emp2.hashCode()) {
            System.out.println("Hash code igual");
        } else {
            System.out.println("Hashcode diferente");
        }
    }
}
