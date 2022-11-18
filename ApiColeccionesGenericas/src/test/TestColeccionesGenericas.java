package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
       List<String> miLista = new ArrayList<>();//se puede duplicar
        miLista.add("Lunes");
        miLista.add("martes");
        miLista.add("miercoles");
        miLista.add("jueves");
        miLista.add("viernes");
      
        
        Set<String> miSet = new HashSet<>();//no se puede duplicarr
        miSet.add("Lunes");
        miSet.add("martes");
        miSet.add("miercoles");
        miSet.add("jueves");
        miSet.add("viernes");
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
       // String elemento = (String)miMapa.get("valor");
        //System.out.println("elemento = " + elemento);
        imprimir(miMapa.values());
    }
    
    
    public static void imprimir(Collection col){
        System.out.println(col.getClass().getSimpleName());
        col.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
    }
}
