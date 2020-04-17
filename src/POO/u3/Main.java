package POO.u3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Crea una clase cuyo método main ejecute una comparación letra a letra usando equals de dos
        palabras usando bucles. Ejemplo: si las palabras son “avispa” y “ave” el programa debe dar
        como resultado: ¿Letra 1 igual en las dos palabras? True. ¿Letra 2 igual en las dos palabras?
        True ¿Letra 3 igual en las dos palabras? False ¿Letra 4 igual en las dos palabras? La palabra
        2 no tiene letra 4 ¿Letra 5 igual en las dos palabras? La palabra 2 no tiene letra 5 ¿Letra 6
        igual en las dos palabras? La palabra 2 no tiene letra 6.
        * */
        String a = new String("casa");
        String b = new String("casaa");
        /*
        * Cree la clase Animal con sus atributos raza (String) y nombre (String). Cree el método equals
        de esa clase para poder comparar un animal con otro. Para ser considerado el mismo animal,
        la raza y el nombre deberán ser iguales. Cree una clase ejecutable para verificar el correcto
        funcionamiento de la clase anteriormente creada.
        * */
        //compararDosStrings(a,b);

        /*
        Animal perro1 = new Animal("Perro", "pepe");
        Animal perro2 = new Animal("Perro", "pepe");
        System.out.println(perro1.equals(perro2));
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("lalo1");
        arrayList.add("lalo2");
        arrayList.add("lalo3");
        arrayList.add("lalo4");
        arrayList.add("lalo5");
        arrayList.add("lalo6");
        arrayList.add("lalo7");
        arrayList.add("lalo8");
        arrayList.add("lalo9");
        arrayList.add("lalo10");

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            arrayList2.add((int) (Math.random() * 100) + 1);
        }

         */
/*
        arrayList2.add(1);
        Scanner teclado = new Scanner(System.in);
        int letra = teclado.nextInt();
        boolean bandera = false;
        for(int i = 0; i<arrayList2.size(); i++){
            if(arrayList2.get(i) == letra){
                System.out.println("esta aqui en el slot "+i);
                bandera = true;
                break;
            }
        }
        if(!bandera){
            System.out.println("No se encontro su numero");
        }

 */
        //System.out.println(arrayList2);
/*
        System.out.println(queValorTiene(arrayList, 4));
        System.out.println(eliminarValor(arrayList, 4));
        System.out.println(queValorTiene(arrayList, 4));
        System.out.println(agregarValor(arrayList, 4));
        System.out.println(queValorTiene(arrayList, 4));
        System.out.println(maxYmin(arrayList2));


 */
        /*
        System.out.println(avg(arrayList2));

        Futbolista f1 = new Futbolista("jose",4,Posicion.DEFENSOR);
        System.out.println(f1.toString());

         */

        madera[] maderas = madera.values();
        for (madera madera: maderas
             ) {
            System.out.println(madera.cuantoCuesta(2.27));
        }
    }
    public static String queValorTiene(ArrayList<String> a,int indice){
        return a.get(indice);
    }
    public static String eliminarValor(ArrayList<String> a,int indice){
        a.remove(indice);
        return "se elimino el indice";
    }
    public static String agregarValor(ArrayList<String> a,int indice){
        Scanner teclado = new Scanner(System.in);
        String letra = teclado.nextLine();
        a.set(indice,letra);
        return "se reemplazo el indice";
    }

    public static double avg (ArrayList<Integer> a){
        double avg = 0;

        for(int i = 0; i<a.size();i++){
            avg += a.get(i);
        }
        return avg/a.size();
    }

    public static String maxYmin(ArrayList<Integer>a){
        double max = 0;
        for(int i = 0; i<a.size();i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }

        }
        double min = max;
        for(int i = 0; i<a.size();i++){
            if(a.get(i) < min){
                min = a.get(i);
            }
        }

        return "el  maximo es "+max+" y el minimo es "+min;
    }


    public static String compararDosStrings(String a, String b){
        /*
        * Falta resolver el inconveniente que pasa cuando una letra es mas grande que 1 caracter con respecto a la otra, consultar al profesor.
        * */
        int masLargo;
        if(a.length()>=b.length()){
            masLargo = a.length();
        }else{
            masLargo = b.length();
        }

        for(int i = 0; i<masLargo;i++){
             if(!a.substring(i).isEmpty() && !b.substring(i).isEmpty() && a.substring(i,i+1).equals(b.substring(i,i+1))){
                System.out.println("Son iguales en la letra: "+i);
            }else if(a.length()<=b.length()) {
                System.out.println("La primera palabra no tiene letra "+i);
            }else{
                System.out.println("La segunda palabra no tiene letra "+i);
             }
        }
        return "Ingreso caracteres no validos";
    }
}
