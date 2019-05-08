/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Habitacion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author shabi
 */
public class ControladorTresHabitaciones {
    
                    public ControladorTresHabitaciones(JButton botonSiguienteTresHabitaciones,JComboBox comboBoxResultados3Habitaciones1,JComboBox comboBoxResultados3Habitaciones2,JComboBox comboBoxResultados3Habitaciones3){
        botonSiguienteTresHabitaciones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Tres Habitaciones");
                
                
            }
            
        });
    }
    
                public void habitacionSeleccionada(JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2,JComboBox comboBoxResultados2Habitaciones3){
                    
//                        Aqui habria que hacer un get por ejemplo del Codigo Habitacion que ha sido seleccionada en el ComboBox y despues pasarlo al objeto que corresponda
//                        Como ejemplo seria:
//                        
//                        comboBoxResultados2Habitaciones1.getSelectedItem();
//                        
//                        Conseguir el Codigo Habitacion, sacar toda la informacion de la habitacion con una consulta y pasarla a los setters de ese objeto, en este caso:
//                         
//                         Modelo.Habitacion.habitacion1.setCod_habitacion(1);
//                         Modelo.Habitacion.habitacion1.setCod_habitacion(1);
//                         Modelo.Habitacion.habitacion1.setCama_simple(0);
//                         Modelo.Habitacion.habitacion1.setCama_doble(0);
//                         Modelo.Habitacion.habitacion1.setCama_nino(0);
//                         Modelo.Habitacion.habitacion1.setPrecio_habitacion(50.0);
//                         
//                         y asi con los objetos necesarios, en este caso 3
                         
                    

            }
}
