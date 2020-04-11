package POO.u4.cuenta;

import org.w3c.dom.ls.LSOutput;

public class Cuenta {
    private String dniTitular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String dniTitular) {
        this.Cuenta(dniTitular,0);
    }

    public void Cuenta(String dniTitular, double saldo) {
        this.dniTitular = dniTitular;
        this.saldo = saldo;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
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
                "dniTitular='" + dniTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String depositar (double importe){
        if(!(importe<=0)){
            this.setSaldo(this.getSaldo()+importe);
            return "ok";
        }else {
            return "error";
        }
    }

    public String extraer (double importe){
        if(!((this.getSaldo()-importe)<0)){
            this.setSaldo(this.getSaldo()-importe);
            return "Se realico ";
        }else{
            return "no se realizo";
        }
    }
}
