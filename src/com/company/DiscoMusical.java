package com.company;

public class DiscoMusical {
    private String titulo;
    private String autor;
    private int anioEdicion;
    private String formato;
    private boolean digital;

    //constructor

    public DiscoMusical() {
    }

    public DiscoMusical(String titulo, String autor, int anioEdicion, String formato, boolean digital) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.formato = formato;
        this.digital = digital;
    }

    // getters and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    //metodos

    @Override
    public String toString() {
        return "DiscoMusical{" +
                "titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", anioEdicion = " + anioEdicion +
                ", formato = '" + formato + '\'' +
                ", digital = " + digital +
                '}';
    }
}
