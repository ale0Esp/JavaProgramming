package genericos;

public class ClaseGenerica<T> {//Recibe T en el contructor y cambia dinamicamente el tipo de variable
    private T objeto;
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es "+ objeto.getClass().getSimpleName());
    }
}
