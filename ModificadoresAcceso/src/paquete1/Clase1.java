/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Windows
 */
public class Clase1 {
    protected String Atributo1 ="Atributo protected";
    
    protected Clase1(){
        System.out.println("Constructo protected ");
    }
    public Clase1(String ar){
        System.out.println("constructor "+ ar);
    }
    protected void metodo(){
        System.out.println("Metodo protected");
    }
}
