package test;

import domain.Persona;

public class TestBloques {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.getIdPersona();
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona();
        persona2.getIdPersona();
        System.out.println("persona2 = " + persona2);
    }
}
