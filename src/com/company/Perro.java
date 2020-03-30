package com.company;

public class Perro {
    private String nombre;
    private String raza;
    private int altura;
    // constructores
    public Perro() {
    }

    public Perro(String nombre, String raza, int altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //metodos
    public void ladrar(){
        System.out.println("estoy ladrando");
    }
    public void caminar(){
        System.out.println("estoy caminando");
    }
    public void saltar(){
        System.out.println("estoy saltando");
    }
    public void recobar(){
        System.out.println("Me estoy recobando");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", altura=" + altura +
                '}';
    }
}
