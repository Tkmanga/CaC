package POO.u5.Figura;

public class Circulo extends Figura2D{
    //atributos
    private int radio;
    //constructores

    public Circulo() {
    }

    public Circulo(String nombre, int grosorBorde, int color, int radio) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }
    //getters and setters

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
    void calcularArea() {
        System.out.println("el area es "+(this.radio*this.radio));
    }

    @Override
    void calcularPerimetro() {
        System.out.println("el perimetro es "+(Math.PI*2*this.radio));
    }

    public int cambiarTamanio(){
        return 2;
    }

}
