package POO.u5.Figura;

abstract class Figura2D extends Figura {
    //Constructor

    public Figura2D() {
    }

    public Figura2D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }

    //metodos abstractos

    abstract void calcularArea();
    abstract void calcularPerimetro();
}
