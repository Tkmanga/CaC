package POO.u5.Figura;

abstract class Figura {
    //atributos
    private String nombre;
    private int grosorBorde;
    private int color;
    //constructores
    public Figura() {
    }

    public Figura(String nombre, int grosorBorde, int color) {
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    //metodo abstracto
    abstract void dibujar();

}
