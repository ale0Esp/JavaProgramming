package domain;

public class Producto {
    protected int idProducto;
    private static int id;
    protected String tipo;
    protected double precio;
    public Producto(String tipo, double precio){
        this.idProducto=Producto.id++;
        this.tipo=tipo;
        this.precio=precio;
    }
    
    public int getId(){
        return Producto.id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getprecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(idProducto);
        sb.append(", tipo=").append(tipo);
        sb.append(", precio=").append(precio);
        return sb.toString();
    }
    
    
}
