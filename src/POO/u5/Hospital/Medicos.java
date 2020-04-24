package POO.u5.Hospital;

public class Medicos extends Personal{
    //atributos
    private String Matricula;
    private String Especialidad;



    public Medicos(double sueldo, int edad, String apellido, String nombre) {
        super(sueldo, edad, apellido, nombre);
        this.sueldo = sueldo;
        Matricula = "35853";
        Especialidad = "Clinica Medica";
    }

    @Override
    void Sueldo() {
        System.out.println("El sueldo de Medico es de "+this.sueldo+"-");
    }
}
