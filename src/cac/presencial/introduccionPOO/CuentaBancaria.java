package cac.presencial.introduccionPOO;

public class CuentaBancaria {

    private int saldo;

    public void depositar(int a){
        int b = this.getSaldo();
        b +=  a;
        this.setSaldo(b);
    }
    public void extraer(int a){
        int b = this.getSaldo();
        b -= a;
        this.setSaldo(b);
    }
    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
