package POO.u5.Hospital;

public class Enfermeros extends  Personal{
    //Atributos
    private String Matricula;
    //constructors

    public Enfermeros(double sueldo, int edad, String apellido, String nombre) {
        super(sueldo, edad, apellido, nombre);
        this.sueldo = sueldo;
        Matricula = "25836";
    }


    @Override
    void Sueldo() {
        System.out.println("El sueldo de Enfermero es de "+sueldo+"-");
    }
}
