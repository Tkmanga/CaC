package POO.u4.factura;

public class Factura extends Precio{
    private String emisor;
    private String cliente;

    public Factura(double importeNeto, String emisor, String cliente) {
        super(importeNeto);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "emisor='" + emisor + '\'' +
                ", cliente='" + cliente + '\'' +
                '}';
    }

    public String imprimirFactura(){
        return "Factura{" +
                "emisor='" + emisor + '\'' +
                ", cliente='" + cliente + '\'' +
                '}'+
                "Precio{" +
                "importeNeto: $" + this.getImporteNeto() +
                ", Iva 21.0% : $" + this.getPorcentajeIva() +
                ", Importe total: $" + this.getImporteTotal() +
                '}';
    }
}
