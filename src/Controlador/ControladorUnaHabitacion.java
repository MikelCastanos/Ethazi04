/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorHotelesDisponibles.hotelSeleccionado;
import static Controlador.ControladorPago.cantidad_insertada;
import static Controlador.ControladorUbicacionHotel.seleccionUbicacion;
import static Controlador.ControladorTipoAlojamiento.tipoDeAlojamiento;
import Controlador.ControladorTipoAlojamiento;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shabi
 */
public class ControladorUnaHabitacion {
    
            public ControladorUnaHabitacion(JButton botonCancelar,JButton botonSiguienteUnaHabitacion,JComboBox comboBoxResultadosHabitaciones){
        botonSiguienteUnaHabitacion.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Una Habitacion");
                rellenarComboBox(comboBoxResultadosHabitaciones);
                Alojamiento.alojamiento1.calcularDiasFestivos();
                System.out.println("Habitacion seleccionada "+comboBoxResultadosHabitaciones.getSelectedItem());
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
        public void rellenarComboBox (JComboBox comboBoxResultadosHabitaciones){
            Hotel hotel= new Hotel();
            Habitacion habitacion= new Habitacion();
            //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
            hotel.seleccionHotelCompleta(hotelSeleccionado);
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
            Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHabitaciones.addItem(ite.next()); 
          }
           }
        
            public void habitacionSeleccionada(JComboBox comboBoxResultadosHabitaciones){
                comboBoxResultadosHabitaciones.getSelectedItem();
            }
            
}
