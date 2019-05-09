/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hotel;
import Vista.VistaDosHabitaciones;
import Vista.VistaTresHabitaciones;
import Vista.VistaUnaHabitacion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class ControladorComplementos {
    
                        public ControladorComplementos(JButton botonSiguienteComplementos,JCheckBox checkboxWifi,JCheckBox checkboxPiscina,JCheckBox checkboxSpa,JCheckBox checkboxParking,JCheckBox checkboxAA,JCheckBox checkboxRestaurante,JCheckBox checkboxBar,JCheckBox checkboxGym){
        botonSiguienteComplementos.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                irSeleccionarHabitacion();
                
            }
            
        });
    }
    
                        
                        public void irSeleccionarHabitacion(){
                                        
            if(Hotel.hotel1.getNum_habitaciones()==1){
                VistaUnaHabitacion vistauna=new VistaUnaHabitacion();
                vistauna.setBounds(0,0,600,730);
                vistauna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistauna.setVisible(true);
            }
            if(Hotel.hotel1.getNum_habitaciones()==2){
                VistaDosHabitaciones vistados=new VistaDosHabitaciones();
                vistados.setBounds(0,0,600,730);
                vistados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistados.setVisible(true);
            }
            if(Hotel.hotel1.getNum_habitaciones()==3){
                VistaTresHabitaciones vistatres=new VistaTresHabitaciones();
                vistatres.setBounds(0,0,600,730);
                vistatres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistatres.setVisible(true);
            }
                        }
}
