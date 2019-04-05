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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ControladorUbicacion {
    
    VistaBienvenida vista;
    Modelo modelo;
    ActionListener actionListener;
    
    public ControladorUbicacion(){}

    public ControladorUbicacion(VistaBienvenida vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    
    
    public void controlBoton(){
        actionListener = new ActionListener() {
        
                public void actionPerformed(ActionEvent actionEvent) {  
                    System.out.println("asd");
                accionBoton();
              }
        };                
        VistaUbicacion.getBoton_siguiente2().addActionListener(actionListener); 

    }
    
    public void accionBoton(){
        JOptionPane.showMessageDialog(null,"Si que va");
    }
    
    
    
    
    
    
        }
    

