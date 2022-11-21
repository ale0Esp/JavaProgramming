package tesy;

import domain.PersonaBean;

public class TestJavaBean {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("persona nombre= " + persona.getNombre()+" "+persona.getApellido());
    }
}
