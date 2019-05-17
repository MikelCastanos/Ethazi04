
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import static vista.VistaPago.logo1;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaBienvenida extends JFrame{
    
    JLabel mensaje_bienvenida;
    static JButton boton_siguiente;
   
    
    public VistaBienvenida(){
    
        boton_siguiente=new javax.swing.JButton();

        setLayout(null);
        
        boton_siguiente=new JButton("¡EMPECEMOS!");
        boton_siguiente.setBounds(800,605,150,30);
        add(boton_siguiente);
        
        
       ControladorBienvenida cont=new ControladorBienvenida(boton_siguiente);
        
       /* ImageIcon icono=new ImageIcon("src//images/fondoP.png");
            logo1=new JLabel(icono);
            logo1.setSize(585,695);
            add(logo1);
            validate(); */
            
        JLabel etiqueta = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src//images/avion.gif");
        etiqueta.setIcon(imageIcon);
        imageIcon.setImageObserver(etiqueta);
        etiqueta.setSize(900,900);
        add(etiqueta);
        
    }

    public static JButton getBoton_siguiente() {
        return boton_siguiente;
    }     
    


        
    }


