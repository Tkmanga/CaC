package POO.u4.cuenta;

import org.w3c.dom.ls.LSOutput;

public class Cuenta {
    private Persona apoderado;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(Persona prsn) {
        this.apoderado = prsn;
        this.saldo = 0;
    }

    public Cuenta(Persona asd, int i) {
        this.apoderado = asd;
        this.saldo = i;
    }

    public Persona getApoderado() {
        return this.apoderado;
    }


    public double getSaldo() {
        return saldo;
    }



    @Override
    public String toString() {
        return "Cuenta{" +
                "dniTitular='" + this.getApoderado() + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String depositar(double importe){
        if(!(importe<=0)){
            this.saldo = (this.getSaldo()+importe);
            return "ok";
        }else {
            return "error";
        }
    }

    public String extraer(double importe){
        if(!((this.getSaldo()-importe)<0)){
            this.saldo = (this.getSaldo()-importe);
            return "Se realico ";
        }else{
            return "no se realizo";
        }
    }
}
