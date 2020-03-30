package com.company;

public class Persona {
    private String  nombre;
    private double  altura;
    private int edad;
    private String genero;
    private String colorOjos;
    private String sexo;

    //constructores

    public Persona (){}

    public Persona(String nombre, double altura, int edad, String genero) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
    }

    //getters and setters

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
