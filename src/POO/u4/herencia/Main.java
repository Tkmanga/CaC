package POO.u4.herencia;

public class Main {
    public static void main(String[] args) {
        Empleado E1 = new Empleado("Rafael");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");
        T1.setNombre("asd");
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
        System.out.println();
    }
}
