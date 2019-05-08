/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author shabi
 */
public class ControladorDosHabitaciones {
    
                public ControladorDosHabitaciones(JButton botonSiguienteDosHabitaciones,JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones12){
        botonSiguienteDosHabitaciones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Dos Habitaciones");
                
                
            }
            
        });
    }
                
                public void habitacionSeleccionada(JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2){
                comboBoxResultados2Habitaciones1.getSelectedItem();
                comboBoxResultados2Habitaciones2.getSelectedItem();
            }
    
}
