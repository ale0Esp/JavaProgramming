package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class testExepciones {

    public static void main(String[] args) {
        int resultado = 8;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Error excepcion OPeracion");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Ocurrio un error:");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {//ejecuta aunque haya una excepcion
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("resultado = " + resultado);

    }
}
