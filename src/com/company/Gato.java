package com.company;

public class Gato {
    private String nombre;
    private String raza;
    private String color;

    public Gato(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }
    public String maullar(){
        return "maullando";
    }

    public String caminar(){
        return "caminando..";
    }

    public String saltar(){
        return "saltando";
    }

    public String jugar(){
        return "jugando..";
    }
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
