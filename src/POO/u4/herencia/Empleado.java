package POO.u4.herencia;

public class Empleado {
    private String nombre;
    //Constructor

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos

    @Override
    public String toString() {
        return "Empleado{" + nombre  +'}';
    }
}
