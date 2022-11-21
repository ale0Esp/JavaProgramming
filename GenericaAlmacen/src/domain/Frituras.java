package domain;

public class Frituras extends Producto{

    public int peso;
    public Frituras(String tipo, double precio, int peso) {
        super(tipo, precio);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frituras(").append(super.toString());
        sb.append(", peso=").append(peso).append("gm");
        sb.append(')');
        return sb.toString();
    }
    
}
