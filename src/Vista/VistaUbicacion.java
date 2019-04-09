/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;
import static Vista.VistaBienvenida.boton_siguiente;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import static vista.VistaPago.logo1;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaUbicacion extends JFrame{
    
    JLabel mensaje_ubicacion, mensaje_alojamiento;
    JComboBox ubicacion,tipo_alojamiento;
    Date fecha_entrada, fecha_salida;
    static JButton boton_siguiente2;
    
    public static String seleccionUbicacion;
    
    public VistaUbicacion(){
        boton_siguiente2=new javax.swing.JButton();
        
        setLayout(null);
        mensaje_ubicacion=new JLabel("SELECCIONAR UBICACIÓN");
        mensaje_ubicacion.setBounds(200,200,200,30);
        add(mensaje_ubicacion);
        
        ubicacion=new JComboBox();
        ubicacion.setBounds(180,230,200,30);
        add(ubicacion);
        
       /* mensaje_alojamiento=new JLabel("Tipo de Alojamiento");
        mensaje_alojamiento.setBounds(10,70,200,30);
        add(mensaje_alojamiento);
        
        tipo_alojamiento=new JComboBox();
        tipo_alojamiento.setBounds(10,100,200,30);
        add(tipo_alojamiento);*/
        
        boton_siguiente2=new JButton("Siguiente");
        boton_siguiente2.setBounds(450,340,100,30);
        add(boton_siguiente2);
        
        ControladorUbicacion cont=new ControladorUbicacion(boton_siguiente2,ubicacion);
        
                
        cont.rellenarComboBox(ubicacion);
        
        ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,200);
            add(logo2);
            validate();
        
        ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(585,695);
            add(logo1);
            validate();
            
        
    }

    public  JButton getBoton_siguiente2() {

        return boton_siguiente2;
    }





    
    


    

    
    
    
    
}
