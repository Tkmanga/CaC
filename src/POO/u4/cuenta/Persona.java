package POO.u4.cuenta;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;
    private String sexo;
    private Cuenta cuenta;

    public Persona(String dni) {
        this.dni = dni;
        this.nombre = "";
        this.edad = 0;
        this.sexo = "";
    }

    public Persona(String dni, String sexo) {
        this.dni = dni;
        this.nombre = "";
        this.edad = 0;
        this.sexo = sexo;
    }

    public  Persona(String dni, String sexo, String nombre, int edad) {
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

    public boolean esMayor(){
        return this.edad>=18;
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

}
