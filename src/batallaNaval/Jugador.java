package batallaNaval;

import java.util.ArrayList;

public class Jugador{
    Metodos nuevoMetodo = new Metodos();
    private String nombre;
    private String apellido;
    private int puntaje;
    public ArrayList<String> disparos =  new ArrayList<>();
    //

    public void realizarDisparo(String disparo){
        disparos.add(disparo);
    }

    public void consultarDisparos(){
        for(int i = 0; i<=disparos.size()-1;i++) {
            System.out.println(disparos.get(i));
        }
    }

    public void consultarPuntaje(){
        //System.out.println("Su puntaje es "+this.getPuntaje());
        nuevoMetodo.cartelito(this.getPuntaje());
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nuevoMetodo=" + nuevoMetodo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", puntaje=" + puntaje +
                ", disparos=" + disparos +
                '}';
    }

    //constructor

    public Jugador(String nombre, String apellido, int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntaje = puntaje;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase();
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
