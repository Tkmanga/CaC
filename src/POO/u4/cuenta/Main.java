package POO.u4.cuenta;

import java.util.Scanner;

public class Main {

    public void main(String[] args){
        this.crear();
    }

    public String crear(){

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<3 ;i++){
            System.out.println("Ingrese dni");
            String a = teclado.nextLine();
            System.out.println("Ingrese nombre");
            String b = teclado.nextLine();
            System.out.println("Ingrese edad");
            int c = teclado.nextInt();
            System.out.println("Ingrese sexo");
            if (this.confirmarSexo(teclado.nextLine())){

            }
        }
    }

    public boolean confirmarSexo(String a){
        if(a == "M" || a == "F"){
            return true;
        }else{
            return false;
        }

    }


}


