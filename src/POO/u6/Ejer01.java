package POO.u6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer01 extends JFrame {

    private JPanel rootPanel;
    private JButton cargarButton;
    private JLabel resultadoo;
    private int cantidad;
    public int contador = 0;
    private int precio;
    private String respuesta;

    public Ejer01(){
        add(rootPanel);

        setTitle("Probando la config con el design");
        setSize(291,100);

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do{
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos","Cantidad",JOptionPane.INFORMATION_MESSAGE));
                    precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio del producto","Precio",JOptionPane.INFORMATION_MESSAGE));
                    contador += (cantidad*precio);

                    respuesta = JOptionPane.showInputDialog(null,"Quiere continuar cargando?","Consulta",JOptionPane.INFORMATION_MESSAGE);
                    if(respuesta.equals("n") || respuesta.equals("N") ){
                        break;
                    }
                }while (respuesta.equals("Y") || respuesta.equals("y") );
                resultadoo.setText(String.valueOf(contador));
            }

        });
    }
}
