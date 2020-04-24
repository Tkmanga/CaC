package POO.u5.Figura;

abstract class Figura3D extends Figura {
    //atributos
    //constructores

    public Figura3D() {
    }

    public Figura3D(String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
    }

    //metodo abstracto

    abstract double calcularVolumen();

}
