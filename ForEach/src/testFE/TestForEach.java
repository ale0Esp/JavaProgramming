package testFE;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {12, 15, 18, 16, 25};
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for (int edad : edades) {//no se puede usar indices
            System.out.println("edad = " + edad);
        }
        for (Persona Per : personas) {
            System.out.println("Per = " + Per);
        }
    }
}
