package POO.u4.cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente(1,"jose"));
        clientes.add(new Cliente(2,"dario"));
        clientes.add(new Cliente(3,"villegas"));

        System.out.println("Existe el cliente ?: "+ existiraElCliente(clientes,"jose"));
/*

        //punto 9
        for(int i = 0; i<3 ;i++){

            String d = "";
            System.out.println("Ingrese dni");
            String a = teclado.nextLine();
            System.out.println("Ingrese nombre");
            String b = teclado.nextLine();
            System.out.println("Ingrese edad");
            int c = teclado.nextInt();
            teclado.nextLine();
            do{
                System.out.println("Ingrese sexo F o M unicamente");
                d = teclado.nextLine();
            }while(!(confirmarSexo(d)));

            personas.add(new Persona(a,b,d,c));
            if(personas.get(i).esMayor()){
                cuentas.add(new Cuenta(personas.get(i)));
            }
        }

        for (Persona p : personas ) { System.out.println(p); }
        for (Cuenta c: cuentas ) {
            System.out.println(c);
        }
*/

    }
    //Punto 11
    public static boolean existiraElCliente(ArrayList<Cliente> clientes, String nombreCliente){
        for (Cliente cliente:  clientes
             ) {
            if(cliente.getNombre().equals(nombreCliente)){
                return true;
            }
        }
        return false;
    }
    // Metodo para calcular el sexo
    public static boolean confirmarSexo(String a){
        if(a.equals("M")  || a.equals("F")){
            return true;
        }else{
            return false;
        }

    }


}


