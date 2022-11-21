package domain;

import java.io.Serializable;

public class PersonaBean implements Serializable{//serializable para javabeans
    private String nombre;
    private String apellido;
    
    public PersonaBean(){  //javabean  
    }
    
    public PersonaBean(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    
    public String getNombre(){//javabean  
        return this.nombre;
    }
    public void setNombre(String nombre){//javabean  
        this.nombre=nombre;
    }

    public String getApellido() {//javabean  
        return apellido;
    }

    public void setApellido(String apellido) {//javabean  
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
