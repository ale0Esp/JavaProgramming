 package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CPJLaboratorioFinal {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int opc=-1;
        String nombrePelicula;
        //Pelicula peli;
        //String nombreArchivo = "c:\\Users\\Windows\\Documents\\Catalogo.txt";
        ICatalogoPeliculas cat = new CatalogosPeliculasimpl();
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    cat.iniciarArchivo();//C:\Users\Windows\Documents
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula a agregar: ");
                    nombrePelicula=read.nextLine();
                    cat.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    cat.listarPelicula();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula a buscar: ");
                    nombrePelicula=read.nextLine();
                    cat.buscarPelicula(nombrePelicula);
                    break;

            }
        } while (opc != 0);
    }

    public static int menu() {
        System.out.println("Elegir opcion");
        System.out.println("1.-Iniciar catalogo de peliculas");
        System.out.println("2.-Agregar pelicula");
        System.out.println("3.-Listar pelicula");
        System.out.println("4.-Buscat pelicula");
        System.out.println("0.-Salir");
        return Integer.parseInt(read.nextLine());
    }

}
