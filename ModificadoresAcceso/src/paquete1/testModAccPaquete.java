package paquete1;



public class testModAccPaquete {
    public static void main(String[] args) {
        
        Clase2 clase2 = new Clase2();
        clase2.atribDfault="cambio";
        System.out.println("atribDfault = " +clase2.atribDfault);
        clase2.metodo();
         ClaseHijaPrivate cHJ = new ClaseHijaPrivate();
    }
    
}
