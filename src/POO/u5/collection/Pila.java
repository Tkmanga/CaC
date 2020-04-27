package POO.u5.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Pila implements IColeccion{
    //variables
    public int contador;

    private ArrayList<Object> coleccion;

    //constructores

    public Pila(int contador) {
        this.coleccion = new ArrayList<Object>(contador);
        this.contador = 0;

    }
    //getters and setters


    //metodos
    //este funciona
    @Override
    public boolean estaVacia() {
        return this.coleccion.size()==0;
    }

    @Override
    public Object extraer( ) {
        return this.coleccion.get(this.contador);
    }

    @Override
    public Object primero() {
        return (this.coleccion.isEmpty())?null:this.coleccion.get(this.contador-1);
    }

    @Override
    public boolean aniadir(Object aux) {
        if(this.coleccion.size()<this.contador-1){
            coleccion.add(this.coleccion.size(),aux);
            this.contador++;
            return true;
        }else{
            return false;
        }

    }
}
