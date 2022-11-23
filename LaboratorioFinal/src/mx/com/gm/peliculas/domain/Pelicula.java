package mx.com.gm.peliculas.domain;

public class Pelicula {
    private String nombre;
    
    public Pelicula(String nombre){
        this.nombre=nombre;
    }
    public Pelicula(){
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
