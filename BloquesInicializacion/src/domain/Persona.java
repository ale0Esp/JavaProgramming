package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //bloque de inicializacion estatico
    static{//solo se ejecuta una vez en la clase
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }
    {//bloque de inicializacion no estatico//se ejecuta cada constructor
        System.out.println("Ejecucion no estatico");
        this.idPersona=Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
            
}
