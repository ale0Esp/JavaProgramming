package mx.com.gm.peliculas.negocio;

/*
Interface usada oruientada al usuario
*/
public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    public void agregarPelicula(String pelicula);

    public void listarPelicula();

    public void buscarPelicula(String buscar);

    public void iniciarArchivo();
}
