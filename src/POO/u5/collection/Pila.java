package POO.u5.collection;

import java.util.Collection;

public class Pila implements IColeccion{
    //variables
    private int contador;
    private Object[] coleccion;
    //constructores

    public Pila() {
    }

    public Pila(int contador) {
        this.contador = contador;
    }
    //getters and setters


    //metodos

    @Override
    public boolean estaVacia() {
        return false;
    }

    @Override
    public Object extraer() {
        return null;
    }

    @Override
    public Object primero() {
        return null;
    }

    @Override
    public boolean aniadir(Object a) {
        return false;
    }
}
