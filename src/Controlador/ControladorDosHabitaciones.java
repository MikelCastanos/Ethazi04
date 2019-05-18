
package Controlador;

import static Controlador.ControladorHotelesDisponibles.hotelSeleccionado;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
                    JOptionPane.showMessageDialog(null, "Bien");
                }
                Alojamiento.alojamiento1.calcularDiasFestivos();
                
                
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
            iniciostart.setSize(916,729);    iniciostart.setLocationRelativeTo(null);
    iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
                
                public void habitacionSeleccionada(JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2){
                comboBoxResultados2Habitaciones1.getSelectedItem();
                comboBoxResultados2Habitaciones2.getSelectedItem();
            }
                
                        public void rellenarComboBox1 (JComboBox comboBoxResultados2Habitaciones1){
            Hotel hotel= new Hotel();
            Habitacion habitacion= new Habitacion();
            //Llamamos primero a la consulta que carga todos los datos del hotel seleccionado
            hotel.seleccionHotelCompleta(hotelSeleccionado);
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
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
    
}
