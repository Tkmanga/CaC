package POO.u4.cuenta;

import org.w3c.dom.ls.LSOutput;

public class Cuenta {
    private Persona dniTitular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(Persona prsn) {
        this.Cuenta(prsn,0);
    }

    public void Cuenta(Persona dniTitular, double saldo) {
        this.dniTitular = dniTitular;
        this.saldo = saldo;
    }

    public String getDniTitular() {
        return dniTitular.getDni();
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "dniTitular='" + this.getDniTitular() + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String depositar(double importe){
        if(!(importe<=0)){
            this.setSaldo(this.getSaldo()+importe);
            return "ok";
        }else {
            return "error";
        }
    }

    public String extraer(double importe){
        if(!((this.getSaldo()-importe)<0)){
            this.setSaldo(this.getSaldo()-importe);
            return "Se realico ";
        }else{
            return "no se realizo";
        }
    }
}
