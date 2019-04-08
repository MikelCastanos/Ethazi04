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


public class VistaEleccion extends JFrame {
    
        JLabel mensaje_eleccion;
        public JComboBox eleccion;
        static JButton boton_siguiente3;
    
    public VistaEleccion(){
        boton_siguiente3=new javax.swing.JButton();
        
        setLayout(null);
        
        mensaje_eleccion=new JLabel("Estos es lo que hemos encontrado para ti:");
        mensaje_eleccion.setBounds(10,20,200,30);
        add(mensaje_eleccion);
        
        eleccion=new JComboBox();
        eleccion.setBounds(10,40,200,30);
        add(eleccion);
        
        
         boton_siguiente3=new JButton("Siguiente");
        boton_siguiente3.setBounds(10,140,100,30);
        add(boton_siguiente3);

        
        ControladorEleccion cont=new ControladorEleccion(boton_siguiente3);
        cont.rellenarComboBox2(eleccion);
        
        
        

    }
    
    
}
