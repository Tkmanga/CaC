package POO.u3;

public class Futbolista {
    private String nombre;
    private int numero;
    private Posicion pos;

    //Constructores

    public Futbolista(String nombre, int numero, Posicion pos) {
        this.nombre = nombre;
        this.numero = numero;
        this.pos = pos;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    //to string


    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", pos=" + pos +
                '}';
    }
}
