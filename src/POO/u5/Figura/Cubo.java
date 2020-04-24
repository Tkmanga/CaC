package POO.u5.Figura;

public class Cubo extends Figura3D {
    //atributos
    private Cuadrado cuadrado;
    //constructores

    public Cubo() {
    }


    public Cubo(String nombre, int grosorBorde, int color, Cuadrado cuadrado) {
        super(nombre, grosorBorde, color);
        this.cuadrado = cuadrado;
    }

    //getters and setters


    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    @Override
    void dibujar() {
        System.out.println("me estoy dibujando");
    }

    @Override
    double calcularVolumen() {
        return Math.pow(this.cuadrado.getLado(),3);
    }

}
