/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
import static Controlador.ControladorTipoAlojamiento.tipoDeAlojamiento;
import static Controlador.ControladorUbicacionHotel.seleccionUbicacion;
import Modelo.Alojamiento;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import Vista.VistaDosHabitacionesHotel;
import Vista.VistaTresHabitacionesHotel;
import Vista.VistaUnaHabitacionHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Modelo.Hotel.hotel1;

/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorHotelesDisponibles {
    
    static String hotelSeleccionado;
    
                public ControladorHotelesDisponibles(JButton botonCancelar,JButton botonSiguienteHotel,JComboBox comboBoxResultadosHotel){
        botonSiguienteHotel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                hotelSeleccionado=(String) comboBoxResultadosHotel.getSelectedItem();
                //rellenarComboBox(comboBoxResultadosHabitaciones);
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
            iniciostart.setSize(905,720);
            iniciostart.setResizable(false);    iniciostart.setLocationRelativeTo(null);
            iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
                
        public void irSeleccionarHabitacion(){
                                        
            if(hotel1.getNum_habitaciones()==1){
                VistaUnaHabitacionHotel vistauna=new VistaUnaHabitacionHotel();
                vistauna.setSize(905,720);
                vistauna.setResizable(false);    vistauna.setLocationRelativeTo(null);
                vistauna.setVisible(true);
                vistauna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistauna.setVisible(true);
                
            }
            if(hotel1.getNum_habitaciones()==2){
                VistaDosHabitacionesHotel vistados=new VistaDosHabitacionesHotel();
                vistados.setSize(905,720);
                vistados.setResizable(false);    vistados.setLocationRelativeTo(null);
                vistados.setVisible(true);
                vistados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistados.setVisible(true);
            }
            if(hotel1.getNum_habitaciones()==3){
                VistaTresHabitacionesHotel vistatres=new VistaTresHabitacionesHotel();
                vistatres.setSize(905,720);
                vistatres.setResizable(false);    vistatres.setLocationRelativeTo(null);
                vistatres.setVisible(true);
                vistatres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistatres.setVisible(true);
            }
                        }
                 
            public void rellenarComboBox (JComboBox comboBoxResultadosHotel){
            Hotel hotel= new Hotel();
            //Hoteles disponibles por ubicacion
            Iterator<String> ite= hotel.HotelPorLugar(seleccionUbicacion).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHotel.addItem(ite.next()); 
            }
             }
                         
                         
    
}
