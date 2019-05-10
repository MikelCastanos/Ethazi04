/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alojamiento;
import Modelo.Hotel;
import Vista.VistaComplementosHotel;
import Vista.VistaDosHabitacionesHotel;
import Vista.VistaTresHabitacionesHotel;
import Vista.VistaUnaHabitacionHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static Controlador.ControladorPago.cantidad_insertada;
import Vista.VistaBienvenida;
import javax.swing.JOptionPane;


public class ControladorComplementosHotel {
    
                        public ControladorComplementosHotel(JButton botonCancelar,JButton botonSiguienteComplementosHotel,JCheckBox checkboxWifi,JCheckBox checkboxPiscina,JCheckBox checkboxSpa,JCheckBox checkboxParking,JCheckBox checkboxAA,JCheckBox checkboxRestaurante,JCheckBox checkboxBar,JCheckBox checkboxGym){
        botonSiguienteComplementosHotel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                irSeleccionarHabitacion();
                
            }
            
        });
    botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
        
            }

public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
    
                        public void comprobarCheckBoxesComplementosHotel(){
            
            
            
            if(VistaComplementosHotel.checkboxWifiHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setWifi(true);
        }
        
            if(VistaComplementosHotel.checkboxSpaHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setSpa(true);
        }

            if(VistaComplementosHotel.checkboxPiscinaHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setPiscina(true);
        }

            if(VistaComplementosHotel.checkboxParkingHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setParking(true);
        }

            if(VistaComplementosHotel.checkboxAAHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setAireacondicionado(true);
        }

            if(VistaComplementosHotel.checkboxRestauranteHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setRestaurante(true);
        }

            if(VistaComplementosHotel.checkboxBarHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setBar(true);
        }

            if(VistaComplementosHotel.checkboxGymHotel.isSelected()){
            Modelo.Complementos.hotelComplementos.setGimnasio(true);
        }
        
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
