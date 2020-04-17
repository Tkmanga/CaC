package POO.u4.supermercado;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Producto pro1 = new Producto("Producto1",100);
        Producto pro2 = new Producto("Producto2",200);
        Producto pro3 = new Producto("Producto3",300);

        Compra compra1 = new Compra(pro1,2);
        Compra compra2 = new Compra(pro2,4);
        Compra compra3 = new Compra(pro3,6);

        ArrayList<Compra> compras = new ArrayList<Compra>();
        compras.add(compra1);
        compras.add(compra2);
        compras.add(compra3);

        Supermercado superPrecio = new Supermercado(compras);

        System.out.println(superPrecio);

    }
}
