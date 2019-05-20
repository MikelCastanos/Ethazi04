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
import static Modelo.Alojamiento.alojamiento1;
import Modelo.Habitacion;
import static Modelo.Habitacion.habitacion1;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import Vista.VistaResumenHotel;
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
 * @author shabi
 */
public class ControladorUnaHabitacion {
    
        public ControladorUnaHabitacion(JButton botonCancelar,JButton botonSiguienteUnaHabitacion,JComboBox comboBoxResultadosHabitaciones){
        botonSiguienteUnaHabitacion.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Una Habitacion");
                //rellenarComboBox(comboBoxResultadosHabitaciones);
                
                
               
                //Setteamos el precio final del alojamiento() y llamamos dentro al metodo que calcula el precio final
                //lepasamos por paramentros el precio base el festivo cantidad de dias festivos cantidad de dias normales 
                habitacionSeleccionada(comboBoxResultadosHabitaciones);
                
                System.out.println("Probanding");
                System.out.println(habitacion1.getPrecioBase());
                System.out.println(habitacion1.getPrecioFestivo());
                habitacion1.setPrecioFinal(habitacion1.calcularPrecioFinal(habitacion1.getPrecioBase(), habitacion1.getPrecioFestivo(), 
                hotel1.getCantidadDiasFestivos(),hotel1.getCantidadDiasNormales()));
                
                Hotel.hotel1.setPrecioFinal(Habitacion.habitacion1.getPrecioFinal()+Habitacion.habitacion2.getPrecioFinal()+Habitacion.habitacion3.getPrecioFinal());
                
                VistaResumenHotel ResumenDescuentoHotel=new VistaResumenHotel();
                ResumenDescuentoHotel.setSize(905,720);
                ResumenDescuentoHotel.setResizable(false);    ResumenDescuentoHotel.setLocationRelativeTo(null);
                ResumenDescuentoHotel.setVisible(true);
                ResumenDescuentoHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ResumenDescuentoHotel.setVisible(true);
            }
            
            });
        
            botonCancelar.addMouseListener(new MouseAdapter(){
                 public void mouseClicked(MouseEvent a){
                    cancelar();
            }
             }
            );
        
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
        public void rellenarComboBox (JComboBox comboBoxResultadosHabitaciones){
            Hotel hotel= new Hotel();
            Habitacion habitacion= new Habitacion();
            //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
            hotel.seleccionHotelCompleta(hotelSeleccionado);
//            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
            Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHabitaciones.addItem(ite.next()); 
          }
           }
        
        public void habitacionSeleccionada(JComboBox comboBoxResultadosHabitaciones){
            String resultadoHabitacion=(String) comboBoxResultadosHabitaciones.getSelectedItem();
            int codigoHabitacion = Integer.parseInt(resultadoHabitacion.substring(0,3));
            System.out.println("Codigo habitacion substring "+codigoHabitacion);
            Habitacion.habitacion1.setCod_habitacion(codigoHabitacion);

            //Llamar al metodo que consulta siguente
            Habitacion habitacion= new Habitacion();
            habitacion.habitacionSeleccionadaInfo(codigoHabitacion);

        }
            
}
