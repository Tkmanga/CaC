package POO.u5.Figura;

public class Cuadrado extends Figura2D {
    //atributos
    private int lado;
    //constructores
    public Cuadrado() {
    }

    public Cuadrado(String nombre, int grosorBorde, int color, int lado) {
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }
    //getters and setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    void dibujar() {

        System.out.println("me estoy dibujando");
    }

    @Override
    void calcularArea() {
        System.out.println("el area es "+(this.lado*this.lado));
    }

    @Override
    void calcularPerimetro() {
        System.out.println("el perimetro es "+(4*this.lado));
    }


    public int cambiarTamanio(){
        return 2;
    }

}
