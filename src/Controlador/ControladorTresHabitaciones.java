/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorHotelesDisponibles.hotelSeleccionado;
import Modelo.Habitacion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import static Modelo.Habitacion.habitacion1;
import static Modelo.Habitacion.habitacion2;
import static Modelo.Habitacion.habitacion3;
import Modelo.Hotel;
import static Modelo.Hotel.hotel1;
import Vista.VistaBienvenida;
import Vista.VistaResumenHotel;
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
                
                if(comboBoxResultados3Habitaciones1.getSelectedItem().equals(comboBoxResultados3Habitaciones2.getSelectedItem())||comboBoxResultados3Habitaciones1.getSelectedItem().equals(comboBoxResultados3Habitaciones3.getSelectedItem())||comboBoxResultados3Habitaciones2.getSelectedItem().equals(comboBoxResultados3Habitaciones3.getSelectedItem())){
                    JOptionPane.showMessageDialog(null, "Debe seleccionar habitaciones distintas");
                }
                else{
                                        habitacionesSeleccionadas(comboBoxResultados3Habitaciones1,comboBoxResultados3Habitaciones2,comboBoxResultados3Habitaciones3);
                habitacion1.setPrecioFinal(habitacion1.calcularPrecioFinal(habitacion1.getPrecioBase(), habitacion1.getPrecioFestivo(), 
                hotel1.getCantidadDiasFestivos(),hotel1.getCantidadDiasNormales()));
                                habitacion2.setPrecioFinal(habitacion2.calcularPrecioFinal(habitacion2.getPrecioBase(), habitacion2.getPrecioFestivo(), 
                hotel1.getCantidadDiasFestivos(),hotel1.getCantidadDiasNormales()));

                                habitacion3.setPrecioFinal(habitacion3.calcularPrecioFinal(habitacion3.getPrecioBase(), habitacion3.getPrecioFestivo(), 
                hotel1.getCantidadDiasFestivos(),hotel1.getCantidadDiasNormales())); 
                                
                System.out.println("Habitacion1 "+habitacion1.getPrecioFinal());
                System.out.println("Habitacion2 "+habitacion2.getPrecioFinal());
                System.out.println("Habitacion2 "+habitacion3.getPrecioFinal());
               
                Hotel.hotel1.setPrecioFinal(Habitacion.habitacion1.getPrecioFinal()+Habitacion.habitacion2.getPrecioFinal()+Habitacion.habitacion3.getPrecioFinal());
                
                VistaResumenHotel ResumenDescuentoHotel=new VistaResumenHotel();
                ResumenDescuentoHotel.setSize(905,720);
                ResumenDescuentoHotel.setResizable(false);    ResumenDescuentoHotel.setLocationRelativeTo(null);
                ResumenDescuentoHotel.setVisible(true);
                ResumenDescuentoHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ResumenDescuentoHotel.setVisible(true);
                }
//                Alojamiento.alojamiento1.calcularDiasFestivos();
                
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
    
    
                public void habitacionesSeleccionadas(JComboBox comboBoxResultados3Habitaciones1,JComboBox comboBoxResultados3Habitaciones2,JComboBox comboBoxResultados3Habitaciones3){
            String resultadosHabitaciones1=(String) comboBoxResultados3Habitaciones1.getSelectedItem();
            int codigoHabitacion = Integer.parseInt(resultadosHabitaciones1.substring(0,3));
            String resultadosHabitaciones2=(String) comboBoxResultados3Habitaciones2.getSelectedItem();
            int codigoHabitacion2 = Integer.parseInt(resultadosHabitaciones2.substring(0,3));    
            String resultadosHabitaciones3=(String) comboBoxResultados3Habitaciones3.getSelectedItem();
            int codigoHabitacion3 = Integer.parseInt(resultadosHabitaciones3.substring(0,3)); 
            
            System.out.println("Codigo habitacion substring "+codigoHabitacion);
            System.out.println("Codigo habitacion substring "+codigoHabitacion2);
            System.out.println("Codigo habitacion substring "+codigoHabitacion3);
            Habitacion.habitacion1.setCod_habitacion(codigoHabitacion);
            Habitacion.habitacion2.setCod_habitacion(codigoHabitacion2);
            Habitacion.habitacion3.setCod_habitacion(codigoHabitacion3);
            //Llamar al metodo que consulta siguente
            Habitacion habitacion= new Habitacion();
            habitacion.habitacionSeleccionadaInfo(codigoHabitacion);
            habitacion.habitacionSeleccionadaInfo2(codigoHabitacion2);
            habitacion.habitacionSeleccionadaInfo3(codigoHabitacion3);

        }

        public void rellenarComboBox1 (JComboBox comboBoxResultados3Habitaciones1){
                Hotel hotel= new Hotel();
                Habitacion habitacion= new Habitacion();
                //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
                hotel.seleccionHotelCompleta(hotelSeleccionado);
                System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
                //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
                Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
                while(ite.hasNext()){
                comboBoxResultados3Habitaciones1.addItem(ite.next()); 
          }
           }
                        
        public void rellenarComboBox2 (JComboBox comboBoxResultados3Habitaciones2){
                Hotel hotel= new Hotel();
                Habitacion habitacion= new Habitacion();
                //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
                hotel.seleccionHotelCompleta(hotelSeleccionado);
                System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
                //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
                Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
                while(ite.hasNext()){
                comboBoxResultados3Habitaciones2.addItem(ite.next()); 
      }
           }
                                                
        public void rellenarComboBox3 (JComboBox comboBoxResultados3Habitaciones3){
                Hotel hotel= new Hotel();
                Habitacion habitacion= new Habitacion();
                //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
                hotel.seleccionHotelCompleta(hotelSeleccionado);
                System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
                //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
                Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
                while(ite.hasNext()){
                comboBoxResultados3Habitaciones3.addItem(ite.next()); 
      }
           }
}
