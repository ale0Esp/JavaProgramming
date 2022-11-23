package mx.com.gm.peliculas.negocio;



import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogosPeliculasimpl implements ICatalogoPeliculas {
    
    private IAccesoDatos acceso;
    
    public CatalogosPeliculasimpl() {
        this.acceso = new Accesodatosimpl();
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        try {
            Pelicula pelicula = new Pelicula(nombrePelicula);
            boolean anexar = false;
            anexar = acceso.existe(NOMBRE_RECURSO);
            acceso.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
        }
    }
    
    @Override
    public void listarPelicula() {
        try {
            var peliculas = this.acceso.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
        }
        
    }

    @Override
    public void buscarPelicula(String buscar) {
        try {
            String resultado;
            resultado = acceso.buscar(NOMBRE_RECURSO, buscar);
            System.out.println(resultado);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos (buscar)");
        }
    }
    
    @Override
    public void iniciarArchivo() {
        try {
            if (this.acceso.existe(NOMBRE_RECURSO)) {
                acceso.eliminar(NOMBRE_RECURSO);
                acceso.crear(NOMBRE_RECURSO);
            } else {
                acceso.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo");
            ex.printStackTrace(System.out);
        }
    }
    
}
