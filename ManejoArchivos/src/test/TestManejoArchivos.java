package test;

import static manejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
       var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
       escritura(nombreArchivo,"hola desde java");
       anexarArchivo(nombreArchivo,"Helloworld");
        anexarArchivo(nombreArchivo,"Helloworld x2");

       leerArchivo(nombreArchivo);
    }
}
