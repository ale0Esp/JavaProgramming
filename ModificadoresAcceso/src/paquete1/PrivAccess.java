package paquete1;
public class PrivAccess {
    private String atribPrivate="Valoe privado";
    private PrivAccess(){
        System.out.println("Constructor private");
    }
    public PrivAccess(String ar){
        this();
        System.out.println("Constructor publico");
    }
    private void accessPrivate(){
        System.out.println("Method private");
    }
}
