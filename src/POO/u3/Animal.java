package POO.u3;

public class Animal {
    private String raza;
    private String nombre;

    public Animal(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Animal obj){
        return this.nombre.equals(obj.getNombre()) && this.raza.equals(obj.getRaza());
    }
}
