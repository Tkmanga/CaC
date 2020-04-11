package POO.u4.herencia;

final class Oficial extends Operario{
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado{"+this.getNombre()+"}"+"->"+this.getClass().getSuperclass().getSimpleName()+"->"+this.getClass().getSimpleName();
    }
}
