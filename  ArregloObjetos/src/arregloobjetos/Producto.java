package arregloobjetos;

public class Producto {

    private String descripcion;
    private float cantidad;
    private double precio;

    public Producto() {
        this.descripcion = "";
        this.cantidad = 0.00f;
        this.precio = 0.00;
    }

    public Producto(String descripcion, float cantidad, double precio) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
