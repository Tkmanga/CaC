package POO.u5.Figura;

public class Triangulo extends Figura2D {
    //atributos
    private int base;
    private int altura;
    //constructor

    public Triangulo() {
    }

    public Triangulo(String nombre, int grosorBorde, int color, int base, int altura) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    void dibujar() {

        System.out.println("me estoy dibujando");
    }

    @Override
    void calcularArea() {
        System.out.println("el area es "+((this.base*this.altura)/2));
    }

    @Override
    void calcularPerimetro() {
        System.out.println("el perimetro es "+(Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base,2))));
    }

    public int cambiarTamanio(){
        return 2;
    }

}
