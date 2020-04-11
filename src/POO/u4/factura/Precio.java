package POO.u4.factura;

public class Precio {
    protected double importeNeto;
    protected double porcentajeIva = 0.21;

    public Precio() {
    }

    public Precio(double importeNeto) {
        this.importeNeto = importeNeto;
        this.porcentajeIva = this.getPorcentajeIva();
    }

    public double getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(double importeNeto) {
        this.importeNeto = importeNeto;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public double getImporteIVA(){
        return this.getImporteNeto()*this.getPorcentajeIva();
    }

    public double getImporteTotal(){

        return this.getImporteNeto() + this.getImporteIVA();
    }
    @Override
    public String toString() {

        return "Precio{" +
                "importeNeto=" + importeNeto +
                ", porcentajeIva=" + porcentajeIva +
                '}';
    }
}
