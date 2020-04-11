package POO.u4.cacTech;

public class Empleado {
    protected String nombre;
    protected String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    //constructores
    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCategoria(){
        int edad = this.getEdad();
        if(edad <= 21){
            return "Principiante";
        }else if(edad>=22 && edad<=35){
            return "Intermedio";
        }else{
            return "Senior";
        }
    }

    public void aumentarSalario(double porcentaje){
        double salario = getSalario();
        salario = salario+(salario*(100/porcentaje));
        this.setSalario(salario);
    }
    //metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", casado=" + casado +
                ", salario=" + salario +
                ", categoria="+ this.getCategoria() +
                '}';
    }

    public boolean aumentarSalario(int a){
        double salarioActual = this.getSalario();
        salarioActual +=a;
        this.setSalario(salarioActual);
        return true;
    }


}
