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
import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author shabi
 */
public class ControladorTresHabitaciones {
    
                    public ControladorTresHabitaciones(JButton botonCancelar,JButton botonSiguienteTresHabitaciones,JComboBox comboBoxResultados3Habitaciones1,JComboBox comboBoxResultados3Habitaciones2,JComboBox comboBoxResultados3Habitaciones3){
        botonSiguienteTresHabitaciones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Tres Habitaciones");
                
                
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

        public void rellenarComboBox (JComboBox comboBoxResultados2Habitaciones1){
            Hotel hotel= new Hotel();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);ç

            System.out.println("PRINT DE PRUEBA");
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            
            Iterator<String> ite= hotel.HabitacionHoteles(Alojamiento.alojamiento1.getCiudad(), ControladorHotelesDisponibles.hotelSeleccionado).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones1.addItem(ite.next()); 
            //comboBoxResultados2Habitaciones2.addItem(ite.next()); 
          }
           }
        
                public void rellenarComboBox2 (JComboBox comboBoxResultados2Habitaciones2){
            Hotel hotel= new Hotel();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);ç

            System.out.println("PRINT DE PRUEBA");
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            
            Iterator<String> ite= hotel.HabitacionHoteles(Alojamiento.alojamiento1.getCiudad(), ControladorHotelesDisponibles.hotelSeleccionado).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones2.addItem(ite.next()); 
            //comboBoxResultados2Habitaciones2.addItem(ite.next()); 
          }
           }
                
                        public void rellenarComboBox3 (JComboBox comboBoxResultados2Habitaciones3){
            Hotel hotel= new Hotel();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);ç

            System.out.println("PRINT DE PRUEBA");
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            
            Iterator<String> ite= hotel.HabitacionHoteles(Alojamiento.alojamiento1.getCiudad(), ControladorHotelesDisponibles.hotelSeleccionado).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones3.addItem(ite.next()); 
            //comboBoxResultados2Habitaciones2.addItem(ite.next()); 
          }
           }
    
    
                public void habitacionSeleccionada3(JComboBox comboBoxResultados3Habitaciones1,JComboBox comboBoxResultados3Habitaciones2,JComboBox comboBoxResultados3Habitaciones3){
                    
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
//                         y asi con los objetos necesarios, en este caso serian habitacion1, habitacion2 y habitacion3
                         
                    

            }
}
