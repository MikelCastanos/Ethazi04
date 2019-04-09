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


public class VistaEleccion extends JFrame {
    
        JLabel mensaje_eleccion;
        public JComboBox eleccion;
        static JButton boton_siguiente3;
    
    public VistaEleccion(JComboBox ubicacion){
        boton_siguiente3=new javax.swing.JButton();
        
        setLayout(null);
        
        mensaje_eleccion=new JLabel("ESTAS SON LAS ESTANCIAS QUE HEMOS ENCONTRADO:");
        mensaje_eleccion.setBounds(125,200,350,30);
        add(mensaje_eleccion);
        
        eleccion=new JComboBox();
        eleccion.setBounds(180,230,200,30);
        add(eleccion);
        
        
         boton_siguiente3=new JButton("Siguiente");
        boton_siguiente3.setBounds(450,340,100,30);
        add(boton_siguiente3);

        ControladorUbicacion cont2=new ControladorUbicacion();
        cont2.cogerDatos(ubicacion);
        ControladorEleccion cont=new ControladorEleccion(boton_siguiente3,eleccion);
        cont.rellenarComboBox2(eleccion);
        
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
       
    
}
