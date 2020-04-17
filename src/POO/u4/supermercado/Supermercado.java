package POO.u4.supermercado;

import java.util.ArrayList;
import java.util.HashMap;

public class Supermercado {
    private ArrayList<Compra> compras;

    public Supermercado(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        String respuesta = "Supermercado{"+"\n";
        for (Compra compra: this.compras
             ) {
            respuesta += " "+compra+"\n";
        }

        respuesta += '}';
        return respuesta;
    }
}
