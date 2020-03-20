package com.company;

public class Empleado {
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public String calificacion(){
        int edad = this.edad;
        if(edad <21 && edad>=1){
            return "Junior";
        }else if (edad>=21 && edad<=34){
            return "Intermedio";
        }else if (edad>=35){
            return "Senior";
        }else{
            return "ingreso un valor no valido";
        }
    }

    public void aumentarSalario(double porcentaje){
        double salario = this.getSalario();
        salario = (salario*porcentaje)
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", casado=" + casado +
                ", salario=" + salario +
                '}';
    }

    public Empleado() {
    }

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

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
}
