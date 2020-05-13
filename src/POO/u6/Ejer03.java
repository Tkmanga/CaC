package POO.u6;

import javax.swing.*;

public class Ejer03 extends JFrame {

    int[] numerosA = new int[5];
    int[] numerosB = new int[5];
    int[] numerosC = new int[5];
    private JPanel rootPanel;
    private JLabel txtRespuesta;

    public Ejer03 (){
        add(rootPanel);
        setTitle("Ejercicio 02");
        setSize(200,200);

        for (int i = 0; i < numerosA.length; i++){
            numerosA[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero para el primero arreglo en la posicion "+(i+1)+":","Completar 1er arreglo",JOptionPane.INFORMATION_MESSAGE));
        }
        for (int i = 0; i < numerosB.length; i++){
            numerosB[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero para el primero arreglo en la posicion "+(i+1)+":","Completar 1er arreglo",JOptionPane.INFORMATION_MESSAGE));
            numerosC[i] = numerosA[i]+numerosB[i];
        }
        txtRespuesta.setText(armarRespuesta(numerosC));
    }

    public String armarRespuesta (int[] example){
        String respuesta = "";
        for (int a: example) {
            respuesta += a+", ";
        }
        return respuesta;
    }
}
