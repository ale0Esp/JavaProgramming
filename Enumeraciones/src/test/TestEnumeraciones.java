package test;

import enumeracion.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //indicarDias(Dias.MARTES);
        System.out.println("Continenes no. 4: "+Continentes.AFRICA);
        System.out.println("Nu. de paises en el continente: "
                +Continentes.AFRICA.getPaises());
        indicarDias(Dias.VIERNES);
        
    }
    
    
    private static void indicarDias(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("ultimo dia de la semana");
                break;
        }
    }
            
    
}
