package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
         ClaseGenerica<String> objetoString = new ClaseGenerica("hii");
        objetoString.obtenerTipo();
        ClaseGenerica<Boolean> objectoBol = new ClaseGenerica(true);
        objectoBol.obtenerTipo();
    }
}
