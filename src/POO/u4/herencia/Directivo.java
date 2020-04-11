package POO.u4.herencia;

final class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado{" + this.getNombre()  +'}'+"->"+this.getClass().getSimpleName();
    }
}
