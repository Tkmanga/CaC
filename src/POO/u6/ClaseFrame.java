package POO.u6;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JOptionPane;

public class ClaseFrame extends JFrame {
    //variable tipo container
    private Container contenedor;
    //constructor
    public ClaseFrame(){
        contenedor = getContentPane();
        contenedor.setLayout(null);

        setTitle("Codo a codo: titulo de la ventana");//asignando titulo a la barra
        setSize(400,200); //tamaño de la ventana
        setLocationRelativeTo(null); //pone la ventana en el centro de la pantalla
    }

    public static void main(String[] args){
        ClaseFrame Ventana = new ClaseFrame();

        Ventana.setVisible(true);
    }

}

