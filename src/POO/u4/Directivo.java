package POO.u4;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado{" + this.getNombre()  +'}'+"->"+this.getClass().getSimpleName();
    }
}
