package batallaNaval;

public class Submarino extends Barcos {
    public int tripulacion;
    //constructor
    public Submarino(int largo, String nombre, int estado) {
        super(largo, nombre, estado);
    }
    //get y set
    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }
}
