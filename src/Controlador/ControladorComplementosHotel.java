/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alojamiento;
import Modelo.Hotel;
import Vista.VistaDosHabitacionesHotel;
import Vista.VistaTresHabitacionesHotel;
import Vista.VistaUnaHabitacionHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class ControladorComplementosHotel {
    
                        public ControladorComplementosHotel(JButton botonSiguienteComplementosHotel,JCheckBox checkboxWifi,JCheckBox checkboxPiscina,JCheckBox checkboxSpa,JCheckBox checkboxParking,JCheckBox checkboxAA,JCheckBox checkboxRestaurante,JCheckBox checkboxBar,JCheckBox checkboxGym){
        botonSiguienteComplementosHotel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                irSeleccionarHabitacion();
                
            }
            
        });
    }
    
                        
                        public void irSeleccionarHabitacion(){
                                        
            if(Alojamiento.alojamiento1.getNum_habitaciones()==1){
                VistaUnaHabitacionHotel vistauna=new VistaUnaHabitacionHotel();
                vistauna.setBounds(0,0,600,730);
                vistauna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistauna.setVisible(true);
            }
            if(Alojamiento.alojamiento1.getNum_habitaciones()==2){
                VistaDosHabitacionesHotel vistados=new VistaDosHabitacionesHotel();
                vistados.setBounds(0,0,600,730);
                vistados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistados.setVisible(true);
            }
            if(Alojamiento.alojamiento1.getNum_habitaciones()==3){
                VistaTresHabitacionesHotel vistatres=new VistaTresHabitacionesHotel();
                vistatres.setBounds(0,0,600,730);
                vistatres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistatres.setVisible(true);
            }
                        }
}
