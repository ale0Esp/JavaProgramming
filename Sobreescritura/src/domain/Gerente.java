package domain;

public class Gerente extends Empleado {

    private String depa;

    public Gerente(String nombre, double sueldo, String depa) {
        super(nombre, sueldo);
        this.depa = depa;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+" depa: "+this.depa;
    }

}
