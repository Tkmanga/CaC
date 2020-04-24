package POO.u5.Figura;

public class Piramide extends Figura3D {
    //atributos
    private int altura;
    private Triangulo tri;

    //constructor
    public Piramide() {
    }

    public Piramide(String nombre, int grosorBorde, int color,Triangulo tri, int altura) {
        super(nombre, grosorBorde, color);
        this.altura = altura;
        this.tri = tri;
    }

    //getters and setters

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo getTri() {
        return tri;
    }

    public void setTri(Triangulo tri) {
        this.tri = tri;
    }

    @Override
    void dibujar() {

        System.out.println("Me estoy dibujando ");
    }

    @Override
    double calcularVolumen() {
        return 1/3*(Math.pow(this.getTri().getBase(),2)*Math.pow(this.getTri().getBase(),2));
    }
}
