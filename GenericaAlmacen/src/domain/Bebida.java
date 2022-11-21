package domain;

public class Bebida extends Producto{
    
    public double peso;
    public String sabor;
    public Bebida(String tipo, double precio, double peso, String sabor){
        super(tipo,precio);
        this.peso = peso;
        this.sabor = sabor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bebida(").append(super.toString());
        sb.append("peso=").append(peso).append(" l");
        sb.append(')');
        return sb.toString();
    }
    
}
