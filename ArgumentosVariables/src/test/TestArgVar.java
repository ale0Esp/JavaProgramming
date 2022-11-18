package test;

public class TestArgVar {
    public static void main(String[] args) {
        variosParametors("Juan",1,2,3,54,5,65);
    }
    private static void variosParametors(String nombre, int ... numeros){
        System.out.println("nombre= "+nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: "+numeros[i]);
        }
    }
}
