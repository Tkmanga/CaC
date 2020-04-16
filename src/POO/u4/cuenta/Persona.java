package POO.u4.cuenta;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private String sexo;


    public Persona(String dni) {
        this.Persona(dni,"",0,"");

    }

    public Persona(String dni, String sexo) {
        this.Persona(dni,"",0,sexo);
    }

    void Persona(String dni, String nombre, int edad, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                '}';
    }

    public boolean esMayorDeEdad(){
        return this.getEdad()>=18;
    }
}
