package batallaNaval;

public class Barcos {
    private int largo;
    private String nombre;
    private int estado;

    //methods

    public void recibirDisparo(){

    }

    public void hundirse(){

    }

    public void moverse(){

    }
    //constructores

    public Barcos(int largo, String nombre, int estado) {
        this.largo = largo;
        this.nombre = nombre;
        this.estado = estado;
    }

    //getters and setters

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
