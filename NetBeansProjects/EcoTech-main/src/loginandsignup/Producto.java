package loginandsignup;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { 
        return nombre; 
    }
    public double getPrecio() { 
        return precio; 
    }
    public int getStock() { 
        return stock; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) { 
        this.stock = stock; 
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Producto)) return false;
        Producto otro = (Producto) obj;
        return nombre.equals(otro.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
