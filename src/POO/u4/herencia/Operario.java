package POO.u4.herencia;

public class Operario extends Empleado{
    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado{"+this.getNombre()+"}->"+this.getClass().getSimpleName();
    }
}
