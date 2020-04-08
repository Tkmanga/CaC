package batallaNaval;

public class BatallaNaval {
    public static void main(String[] args){
        Metodos met = new Metodos();
        Jugador jug1 = new Jugador("jose","tacacho",0);
        jug1.realizarDisparo("A2");
        jug1.realizarDisparo("B4");
        jug1.realizarDisparo("F5");
        jug1.consultarDisparos();

        Submarino sub1 = new Submarino(3,"pepe",1);
        jug1.consultarPuntaje();
        System.out.println(jug1.toString());
        System.out.println(sub1.toString());
    }
}
