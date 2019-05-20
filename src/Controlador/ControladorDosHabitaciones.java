
package Controlador;

import static Controlador.ControladorHotelesDisponibles.hotelSeleccionado;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import static Modelo.Habitacion.habitacion1;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Modelo.Habitacion.habitacion2;
import static Modelo.Hotel.hotel1;
import Vista.VistaResumenHotel;

/**
 *
 * @author shabi
 */
public class ControladorDosHabitaciones {
    
                public ControladorDosHabitaciones(JButton botonCancelar,JButton botonSiguienteDosHabitaciones,JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2){
        botonSiguienteDosHabitaciones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Dos Habitaciones");
                if(comboBoxResultados2Habitaciones1.getSelectedItem().equals(comboBoxResultados2Habitaciones2.getSelectedItem())){
                    JOptionPane.showMessageDialog(null, "Debe seleccionar habitaciones distintas");
                }
                else{
                    habitacionesSeleccionadas(comboBoxResultados2Habitaciones1,comboBoxResultados2Habitaciones2);
                habitacion1.setPrecioFinal(habitacion1.calcularPrecioFinal(habitacion1.getPrecioBase(), habitacion1.getPrecioFestivo(), 
                hotel1.getCantidadDiasFestivos(),hotel1.getCantidadDiasNormales()));
                                habitacion2.setPrecioFinal(habitacion2.calcularPrecioFinal(habitacion2.getPrecioBase(), habitacion2.getPrecioFestivo(), 
                hotel1.getCantidadDiasFestivos(),hotel1.getCantidadDiasNormales()));
                                
                System.out.println("Habitacion1 "+habitacion1.getPrecioFinal());
                System.out.println("Habitacion2 "+habitacion2.getPrecioFinal());
               
                Hotel.hotel1.setPrecioFinal(Habitacion.habitacion1.getPrecioFinal()+Habitacion.habitacion2.getPrecioFinal()+Habitacion.habitacion3.getPrecioFinal());
                VistaResumenHotel ResumenDescuentoHotel=new VistaResumenHotel();
                ResumenDescuentoHotel.setSize(905,720);
                ResumenDescuentoHotel.setResizable(false);    ResumenDescuentoHotel.setLocationRelativeTo(null);
                ResumenDescuentoHotel.setVisible(true);
                ResumenDescuentoHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ResumenDescuentoHotel.setVisible(true);
                }

                
                
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
                
        public void habitacionSeleccionada(JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2){
        comboBoxResultados2Habitaciones1.getSelectedItem();
        comboBoxResultados2Habitaciones2.getSelectedItem();
            }
                
        public void rellenarComboBox (JComboBox comboBoxResultados2Habitaciones1){
            Hotel hotel= new Hotel();
            Habitacion habitacion= new Habitacion();
            //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
            hotel.seleccionHotelCompleta(hotelSeleccionado);
//          System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
            Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones1.addItem(ite.next()); 
          }
           }
                        
        public void rellenarComboBox2 (JComboBox comboBoxResultados2Habitaciones2){
            Hotel hotel= new Hotel();
            Habitacion habitacion= new Habitacion();
            //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
            hotel.seleccionHotelCompleta(hotelSeleccionado);
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            //Hacemos la consulta de las habitaciones con el codigo del hotel selecionado
            Iterator<String> ite= habitacion.habitacionesHotel(Hotel.hotel1.getCodigoHotel()).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones2.addItem(ite.next()); 
          }
           }
        
                public void habitacionesSeleccionadas(JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2){
            String resultadosHabitaciones1=(String) comboBoxResultados2Habitaciones1.getSelectedItem();
            int codigoHabitacion = Integer.parseInt(resultadosHabitaciones1.substring(0,3));
            String resultadosHabitaciones2=(String) comboBoxResultados2Habitaciones2.getSelectedItem();
            int codigoHabitacion2 = Integer.parseInt(resultadosHabitaciones2.substring(0,3));            
            
            System.out.println("Codigo habitacion substring "+codigoHabitacion);
            System.out.println("Codigo habitacion substring "+codigoHabitacion2);
            Habitacion.habitacion1.setCod_habitacion(codigoHabitacion);
            Habitacion.habitacion2.setCod_habitacion(codigoHabitacion2);
            //Llamar al metodo que consulta siguente
            Habitacion habitacion= new Habitacion();
            habitacion.habitacionSeleccionadaInfo(codigoHabitacion);
            habitacion.habitacionSeleccionadaInfo2(codigoHabitacion2);

        }
    
}
