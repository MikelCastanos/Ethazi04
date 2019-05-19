
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;
import javax.swing.ImageIcon;

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
        boton_siguiente.setOpaque(false);
        boton_siguiente.setContentAreaFilled(false);
        boton_siguiente.setBorderPainted(false);      
        boton_siguiente.setBounds(700,605,150,30);
        add(boton_siguiente);
        
        
       ControladorBienvenida cont=new ControladorBienvenida(boton_siguiente);
        
       /* ImageIcon icono=new ImageIcon("src//images/fondoP.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,692);
            add(logo1);
            validate(); */
            
        JLabel etiqueta = new JLabel();
        ImageIcon imageIcon = new ImageIcon("src//images/avion.gif");
        etiqueta.setIcon(imageIcon);
        imageIcon.setImageObserver(etiqueta);
        etiqueta.setSize(1000,700);
        add(etiqueta);
        
    }

    public static JButton getBoton_siguiente() {
        return boton_siguiente;
    }     
    


        
    }


