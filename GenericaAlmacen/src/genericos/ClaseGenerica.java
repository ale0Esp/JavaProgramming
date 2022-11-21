package genericos;

import java.util.ArrayList;

public class ClaseGenerica <T>{
    private ArrayList<T> paquete= new ArrayList<>();
    public void addProducto(T objeto){
        paquete.add(objeto);
    }

    public ArrayList<T> getList(){
        return paquete;
    }
    
}
