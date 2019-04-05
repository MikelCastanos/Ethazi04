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
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaUbicacion extends JFrame{
    
    JLabel mensaje_ubicacion, mensaje_alojamiento;
    JComboBox ubicacion,tipo_alojamiento;
    Date fecha_entrada, fecha_salida;
    static JButton boton_siguiente2;
    
    public VistaUbicacion(){
        boton_siguiente2=new javax.swing.JButton();
        
        setLayout(null);
        mensaje_ubicacion=new JLabel("Seleccionar Ubicacion");
        mensaje_ubicacion.setBounds(10,20,200,30);
        add(mensaje_ubicacion);
        
        ubicacion=new JComboBox();
        ubicacion.setBounds(10,40,200,30);
        add(ubicacion);
        
        mensaje_alojamiento=new JLabel("Tipo de Alojamiento");
        mensaje_alojamiento.setBounds(10,70,200,30);
        add(mensaje_alojamiento);
        
        tipo_alojamiento=new JComboBox();
        tipo_alojamiento.setBounds(10,100,200,30);
        add(tipo_alojamiento);
        
        boton_siguiente2=new JButton("Siguiente");
        boton_siguiente2.setBounds(10,140,100,30);
        add(boton_siguiente2);
        
        ControladorUbicacion cont=new ControladorUbicacion(boton_siguiente2);
        
    }

    public static JButton getBoton_siguiente2() {
        return boton_siguiente2;
    }
    
    
    
}
