/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaEstanciaSeleccionada;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author shabi
 */
public class ControladorConfigurarHabitacion {
    
    public ControladorConfigurarHabitacion(){}
     public ControladorConfigurarHabitacion(JButton irEstanciaSeleccionada,JComboBox eleccion){
        irEstanciaSeleccionada.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                cargarEstanciaSeleccionada(eleccion);
                
                
            }
            
        });
    }
     
     
     public void cargarEstanciaSeleccionada(JComboBox eleccion){
            VistaEstanciaSeleccionada vistaes=new VistaEstanciaSeleccionada(eleccion);
            vistaes.setBounds(0,0,600,730);
            vistaes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaes.setVisible(true);

          ControladorEstanciaSeleccionada con= new ControladorEstanciaSeleccionada();
          con.cargarValores();
     }
}
