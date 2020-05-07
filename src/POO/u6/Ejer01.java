package POO.u6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer01 extends JFrame {
    private JButton calcularPrecioButton;
    private JPanel rootPanel;



    public Ejer01(){
        add(rootPanel);

        setTitle("Probando la config con el design");
        setSize(400,500);

        calcularPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respuesta = "";

            }
        });
    }
}
