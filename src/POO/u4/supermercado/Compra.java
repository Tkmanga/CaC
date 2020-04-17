package POO.u4.supermercado;

public class Compra {
    private Producto producto;
    private Integer cantidad;

    public Compra(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double total(){
        return this.cantidad*this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return "Compra{" +
                "producto=" + this.producto.getNombre() +" "+
                "precio=" + this.producto.getPrecio() +" "+
                ", cantidad=" + cantidad +" "+
                ", total=" + this.total() +" "+
                '}';
    }
}
