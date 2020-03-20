package com.company;

public class Motocicleta {

    private String Matricula;
    private String color;
    private int velocudad;
    private boolean enMarca;

    public String arrancar(){
        return "arrancando";
    }
    public String acelerar(){
        return "acelerar";
    }
    public String frenar(){
        return "frenar";
    }
    public String girar(){
        return "girar";
    }




    public Motocicleta(String matricula, String color, int velocudad, boolean enMarca) {
        Matricula = matricula;
        this.color = color;
        this.velocudad = velocudad;
        this.enMarca = enMarca;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocudad() {
        return velocudad;
    }

    public void setVelocudad(int velocudad) {
        this.velocudad = velocudad;
    }

    public boolean isEnMarca() {
        return enMarca;
    }

    public void setEnMarca(boolean enMarca) {
        this.enMarca = enMarca;
    }
}
