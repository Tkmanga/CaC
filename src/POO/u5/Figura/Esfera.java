package POO.u5.Figura;

public class Esfera extends Figura3D {
    //variables
    private int radio;

    //constructores
    public Esfera() {
    }

    public Esfera(String nombre, int grosorBorde, int color, int radio) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    //getters y setters

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    void dibujar() {
        System.out.println("me estoy dibujando");
    }

    @Override
    double calcularVolumen() {
        return (4/3)*Math.PI*Math.pow(this.getRadio(),3);

    }
}
