package POO.u5.Hospital;

public class Hospital {

    public static void main(String[] args) {
        Personal Med = new Medicos(15000,33,"Perez","Jose");
        Personal Enf = new Enfermeros(11000,25,"Gomez","Roberto");

        Med.Sueldo();
        Enf.Sueldo();

    }
}
