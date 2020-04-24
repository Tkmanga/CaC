package POO.u5.Hospital;

public abstract class Personal { //Declaramos que la clase es abstracta
    //atributos

    public double sueldo;
    public int edad;
    public String apellido;
    public String nombre;

    public Personal(double sueldo, int edad, String apellido, String nombre) {
    }

    abstract void Sueldo();

}
