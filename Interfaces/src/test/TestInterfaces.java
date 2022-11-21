package test;

import accesosdatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        datos.insertar();
        imprimir(datos);
        datos = new ImplementacionOracle();
        datos.insertar();
        imprimir(datos);
    }
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
