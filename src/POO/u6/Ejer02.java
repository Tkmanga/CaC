package POO.u6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer02 extends JFrame {
    private JPanel rootPanel;
    private JButton cargar;
    private JLabel resultado;
    private int salario = 0;
    private int salarioAcumulado = 0;
    public Ejer02(){

        add(rootPanel);
        setTitle("Ejercicio 02");
        setSize(200,200);
        cargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contador = 1;

                while(salario>=0 && contador<=12){
                    salario = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese salario"+contador,"ingrese",JOptionPane.INFORMATION_MESSAGE));
                    if(salario <=0){
                        break;
                    }else{
                        salarioAcumulado += salario;
                    }
                    contador++;
                }
                resultado.setText(String.valueOf(salarioAcumulado));
            }
        });
    }

}
