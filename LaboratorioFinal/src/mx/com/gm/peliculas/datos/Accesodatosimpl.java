package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;


import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class Accesodatosimpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        List<Pelicula> peliculas = new ArrayList<>();
        File archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                var peli = new Pelicula(lectura);
                peliculas.add(peli);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("Excepcion al listar peliculas" + ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreArchivo);
        PrintWriter salida;
        try {

            salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException ex) {
            throw new EscrituraDatosEx("Excepcion al escribir peliculas" + ex.getMessage());
        } catch (IOException ex) {
            throw new EscrituraDatosEx("Excepcion al escribir peliculas" + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String encontrado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            int indice = 1;
            while (lectura != null) {
                if (buscar != null && buscar.equalsIgnoreCase(lectura)) {
                    encontrado = "Pelicula" + lectura + "Encontrada en el indice= " + indice;
                    break;
                }
                lectura = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            throw new LecturaDatosEx("excepcion al leer/buscar datos" + ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("excepcion al leer/buscar datos" + ex.getMessage());
        }
        return encontrado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            throw new AccesoDatosEx("excepcion al crear archivo" + ex.getMessage());
        }
    }

    @Override
    public void eliminar(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        if(archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
    }
}
