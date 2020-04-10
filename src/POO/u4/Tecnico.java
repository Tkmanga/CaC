package POO.u4;

public class Tecnico extends Operario {
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado{"+this.getNombre()+"}"+"->"+this.getClass().getSuperclass().getSimpleName()+"->"+this.getClass().getSimpleName();
    }
}
