package POO.u3;

public enum madera {

    ROBLE(800),
    CAOBA(770),
    NOGAL(820),
    CEREZA(790);


    private int peso;

    madera( int peso) {

        this.peso = peso;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double cuantoCuesta(double medida ){
        return  this.peso*medida;
    }
}
