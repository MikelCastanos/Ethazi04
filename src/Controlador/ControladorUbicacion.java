/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Vista.*;
import Modelo.*;
import Aplicacion.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ControladorUbicacion {
    
    VistaBienvenida vista;
    Modelo modelo;
    ActionListener actionListener;
    
    public ControladorUbicacion(JButton boton_siguiente2){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                accionBoton();
            }
            
        });
    }

    public ControladorUbicacion(VistaBienvenida vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    
    
    /*public void controlBoton(){
        actionListener = new ActionListener() {
        
                public void actionPerformed(ActionEvent actionEvent) {  
                    System.out.println("asd");
                accionBoton();
              }
        };                
        VistaUbicacion.getBoton_siguiente2().addActionListener(actionListener); 

    }*/
    
    public void accionBoton(){
                    VistaEleccion vistae=new VistaEleccion();
            vistae.setBounds(0,0,600,600);
            vistae.setVisible(true);
    }
    
    
    
    
    
    
        }
    

