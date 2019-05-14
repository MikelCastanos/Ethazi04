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
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
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
                 
            public void rellenarComboBox (JComboBox comboBoxResultadosHotel){
            Hotel hotel= new Hotel();
                System.out.println("Controlador hoteles disponibles");
//            hotel.consultaCompleta(hotelSeleccionado);
            Iterator<String> ite= hotel.AlojamientoPorLugar(seleccionUbicacion).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHotel.addItem(ite.next()); 
          }
           }
                         
                         
    
}
