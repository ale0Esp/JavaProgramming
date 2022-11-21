package accesosdatos;

public class ImplementacionMySql implements IAccesoDatos {//no se usa BD solo se  menciona como ejemplo

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySql");

    }

}
